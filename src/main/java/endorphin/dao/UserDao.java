package endorphin.dao;

import endorphin.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDao 提供关于用户的操作接口
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Repository
public interface UserDao {
    /**
     * 通过用户名查找用户
     *
     * @param username 用户名
     * @return 查找到的用户
     */
    User findUserByUserName(String username);

    /**
     * 通过用户 id 查找用户
     *
     * @param id 用户 id
     * @return 查找到的用户
     */
    User findUserByUserId(int id);

    /**
     * 添加用户
     *
     * @param user 新增的用户
     */
    void addUser(User user);

    /**
     * 通过用户名删除用户
     *
     * @param username 删除用户的用户名
     */
    void deleteUserByUserName(String username);

    /**
     * 更新用户信息
     *
     * @param user 需要更新的用户
     */
    void updateUserByUserName(User user);

    /**
     * 用户名获取用户密码
     *
     * @param username 用户名
     * @return 密码
     */
    String getUserPasswordByUserName(String username);

    /**
     * 获取所有的用户信息
     *
     * @return 用户列表
     */
    List<User> getAllUserInfo();
}
