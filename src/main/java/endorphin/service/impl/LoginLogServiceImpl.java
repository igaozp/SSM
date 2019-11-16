package endorphin.service.impl;

import endorphin.dao.UserLoginLogDao;
import endorphin.domain.UserLoginLog;
import endorphin.service.LoginLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * LoginLogServiceImpl
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Service
@AllArgsConstructor
public class LoginLogServiceImpl implements LoginLogService {
    private final UserLoginLogDao userLoginLogDao;

    @Override
    public void listAllUserLoginLog() { }

    @Override
    public void addUserLoginLog(UserLoginLog userLoginLog) {
        userLoginLogDao.addUserLoginLog(userLoginLog);
    }
}
