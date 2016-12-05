package com.excited.service.Impl;

import com.excited.dao.UserLoginLogDao;
import com.excited.domain.UserLoginLog;
import com.excited.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginLogServiceImpl implements LoginLogService {
    @Autowired
    UserLoginLogDao userLoginLogDao;

    @Override
    public void listAllUserLoginLog() {

    }

    @Override
    public void addUserLoginLog(UserLoginLog userLoginLog) {
        userLoginLogDao.addUserLoginLog(userLoginLog);
    }
}
