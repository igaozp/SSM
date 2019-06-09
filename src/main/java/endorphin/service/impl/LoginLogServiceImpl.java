package endorphin.service.impl;

import endorphin.dao.UserLoginLogDao;
import endorphin.domain.UserLoginLog;
import endorphin.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * LoginLogServiceImpl
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {
    @Resource
    private UserLoginLogDao userLoginLogDao;

    @Override
    public void listAllUserLoginLog() { }

    @Override
    public void addUserLoginLog(UserLoginLog userLoginLog) {
        userLoginLogDao.addUserLoginLog(userLoginLog);
    }
}
