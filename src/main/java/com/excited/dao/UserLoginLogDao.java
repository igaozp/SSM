package com.excited.dao;

import com.excited.domain.UserLoginLog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLoginLogDao {
    public List<UserLoginLog> listAllUserLoginLog();

    public void addUserLoginLog(UserLoginLog userLoginLog);
}
