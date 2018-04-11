package endorphin.service;

import endorphin.domain.UserLoginLog;

/**
 * LoginLog 登录日志的服务接口
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
public interface LoginLogService {
    /**
     * 获取所有的登录日志
     */
    void listAllUserLoginLog();

    /**
     * 添加登录日志
     *
     * @param userLoginLog 新增的登录日志
     */
    void addUserLoginLog(UserLoginLog userLoginLog);
}
