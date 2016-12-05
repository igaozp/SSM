package com.excited.controller;

import com.excited.domain.Board;
import com.excited.domain.Post;
import com.excited.domain.User;
import com.excited.service.BoardService;
import com.excited.service.PostService;
import com.excited.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    BoardService boardService;

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    // 论坛管理中心
    @RequestMapping(value = "/manageCenter")
    public String manageCenter(HttpServletRequest request) {
        if (request.getSession().getAttribute("username").equals("admin")) {
            return "admin/manageCenter";
        }
        return "redirect:/error";
    }

    // 论坛版块管理中心
    @RequestMapping(value = "/manageBoard")
    public String manageBoard(HttpServletRequest request) {
        if (request.getSession().getAttribute("username").equals("admin")) {
            List<Board> boards = boardService.listAllBoard();
            request.setAttribute("boards", boards);
            return "admin/manageBoard";
        }
        return "redirect:/error";
    }

    // 添加论坛板块
    @RequestMapping(value = "addBoard", method = RequestMethod.POST)
    public String addBoard(Board board, HttpServletRequest request) {
        if (board != null) {
            boardService.addBoardByBoard(board);
            return "redirect:/admin/manageBoard";
        }

        request.getSession().setAttribute("Msg", "添加板块出错！");
        return "admin/error";
    }

    // 修改板块信息
    @RequestMapping(value = "updateBoard", method = RequestMethod.POST)
    public String updateBoard(Board board, HttpServletRequest request) {
        if (board != null) {
            boardService.updateBoardInfo(board);
            // 成功更新数据后跳转页面
            return "redirect:/admin/manageBoard";
        }

        // 更新数据失败跳转到错误页面
        return "redirect:/error";
    }

    @RequestMapping(value = "manageUser")
    public String manageUser(HttpServletRequest request) {
        List<User> users = userService.getAllUser();
        if (users != null) {
            request.setAttribute("users", users);
            return "/admin/allUserInfo";
        }

        return "redirect:/error";
    }

    @RequestMapping(value = "managePost")
    public String managePost(HttpServletRequest request) {
        List<Post> posts = postService.listAllPost();
        if (posts != null) {
            request.setAttribute("posts", posts);
            return "/admin/allPostInfo";
        }

        return "redirect:/error";
    }
}
