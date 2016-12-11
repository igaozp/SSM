package com.excited.controller;

import com.excited.domain.User;
import com.excited.domain.UserLoginLog;
import com.excited.service.LoginLogService;
import com.excited.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private LoginLogService loginLogService;

    // 用户登录
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String userLogin(User loginUser, HttpServletRequest request, RedirectAttributes redirect) {
        // 通过用户名查找User对象
        User user = userService.getUserByUserName(loginUser.getUserName());
        String password = "";
        if (user != null) {
            password = userService.getPassword(user.getUserName());
        }

        // 判断登录信息是否正确
        if (user != null && loginUser.getPassword().equals(password)) {

            // 获取登录基本信息
            String lastIp = request.getRemoteAddr();
            String userName = user.getUserName();
            Timestamp lastLoginTime = new Timestamp(new Date().getTime());

            // 更新用户信息
            user.setLastIp(lastIp);
            user.setLastLoginTime(lastLoginTime);
            user.setCredit(5 + user.getCredit());
            userService.updateUserByUserName(user);

            // 更新用户登录日志
            UserLoginLog userLoginLog = new UserLoginLog();
            userLoginLog.setUserName(userName);
            userLoginLog.setLoginIp(lastIp);
            userLoginLog.setLoginDateTime(lastLoginTime);
            loginLogService.addUserLoginLog(userLoginLog);

            // 登陆成功，跳转到主页
            request.getSession().setAttribute("username", user.getUserName());
            return "redirect:/main";
        }

        // 登录失败，跳转页面
        request.getSession().setAttribute("Msg", "登录失败！");
        return "user/loginStatus";
    }

    // 用户注册
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String userRegister(User userRegister, HttpServletRequest request) {
        User user = userRegister;
        HttpSession session = request.getSession();
        if (user != null) {
            try {
                String username = user.getUserName();
                String ip = request.getRemoteAddr();

                // 如果数据库中没有该用户，可以注册，否则跳转页面
                if (userService.getUserByUserName(username) == null) {

                    // 添加用户
                    user.setLastIp(ip);
                    Timestamp createLoginTime = new Timestamp(new Date().getTime());
                    user.setCreateTime(createLoginTime);
                    user.setLastLoginTime(createLoginTime);
                    userService.addUser(user);

                    // 添加用户登录日志
                    UserLoginLog userLoginLog = new UserLoginLog();
                    userLoginLog.setUserName(username);
                    userLoginLog.setLoginIp(ip);
                    userLoginLog.setLoginDateTime(createLoginTime);
                    loginLogService.addUserLoginLog(userLoginLog);

                    // 注册成功跳转
                    session.setAttribute("username", username);
                    return "index";
                } else {
                    session.setAttribute("Msg", "注册失败，用户名已被占用！");
                    return "user/loginStatus";
                }
            } catch (Exception e) {
                e.printStackTrace();
                session.setAttribute("Msg", "发生未知错误！");
                return "user/loginStatus";
            }
        }

        session.setAttribute("Msg", "发生未知错误！");
        return "user/loginStatus";
    }

    // 显示个人信息
    @RequestMapping(value = "/listUserInfo")
    public String listUserInfo(String username, HttpServletRequest request) {
        User user = userService.getUserByUserName(username);
        request.setAttribute("user", user);
        return "user/userInfo";
    }

    // 修改个人信息页面
    @RequestMapping(value = "/userUpdateInfo", method = RequestMethod.GET)
    public String userUpdateInfoPage(String username, HttpServletRequest request) {
        User user = userService.getUserByUserName(username);
        request.setAttribute("user", user);
        return "user/userUpdateInfo";
    }

    // 提交用户修改信息
    @RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
    public String updateUserInfo(User user, RedirectAttributes redirectAttributes) {
        User newUser = user;
        userService.updateUserByUserName(newUser);
        redirectAttributes.addAttribute("username", newUser.getUserName());
        return "redirect:listUserInfo";
    }

    // 用户注销功能
    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpServletRequest request) {
        request.getSession().removeAttribute("username");
        return "index";
    }
}
