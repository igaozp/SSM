package endorphin.service.impl;

import endorphin.dao.UserLoginLogDao;
import endorphin.domain.UserLoginLog;
import endorphin.service.LoginLogService;
import org.springframework.stereotype.Service;

/**
 * LoginLogServiceImpl
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {
    private final UserLoginLogDao userLoginLogDao;

    public LoginLogServiceImpl(UserLoginLogDao userLoginLogDao) {
        this.userLoginLogDao = userLoginLogDao;
    }

    @Override
    public void addUserLoginLog(UserLoginLog userLoginLog) {
        userLoginLogDao.addUserLoginLog(userLoginLog);
    }
}
