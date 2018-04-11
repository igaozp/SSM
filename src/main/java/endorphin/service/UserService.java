package endorphin.service;

import endorphin.domain.User;
import java.util.List;

/**
 * UserService 用户功能的服务接口
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
public interface UserService {
    /**
     * 添加用户
     *
     * @param user 用户实例
     */
    void addUser(User user);

    /**
     * 更新用户信息
     *
     * @param user 新的用户
     */
    void updateUserByUserName(User user);

    /**
     * 通过用户名查找用户
     *
     * @param userName 用户名
     * @return 查找到的用户
     */
    User getUserByUserName(String userName);

    /**
     * 通过用户名删除用户
     *
     * @param userName 用户名
     */
    void deleteUserByUserName(String userName);

    /**
     * 获取指定用户的密码
     *
     * @param userName 用户名
     * @return 密码
     */
    String getPassword(String userName);

    /**
     * 获取所有用户
     *
     * @return 用户列表
     */
    List<User> getAllUser();
}
