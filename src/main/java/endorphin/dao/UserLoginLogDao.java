package endorphin.dao;

import endorphin.domain.UserLoginLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserLoginLogDao 提供关于用户登录日志的操作接口
 *
 * @author igaozp
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface UserLoginLogDao {
    /**
     * 获取所有用户的登录日志
     *
     * @return 日志列表
     */
    List<UserLoginLog> listAllUserLoginLog();

    /**
     * 添加登录日志
     *
     * @param userLoginLog 登录日志
     */
    void addUserLoginLog(UserLoginLog userLoginLog);
}
