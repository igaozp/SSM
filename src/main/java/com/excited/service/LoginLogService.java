package com.excited.service;

import com.excited.domain.UserLoginLog;

public interface LoginLogService {
    public void listAllUserLoginLog();

    public void addUserLoginLog(UserLoginLog userLoginLog);
}
