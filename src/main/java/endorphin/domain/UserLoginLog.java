package endorphin.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * UserLoginLog 用户登录日志的实体类
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
public class UserLoginLog implements Serializable {
    private int loginLogId;
    private String userName;
    private String loginIp;
    private Timestamp loginDateTime;
    private User user;

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Timestamp getLoginDateTime() {
        return loginDateTime;
    }

    public void setLoginDateTime(Timestamp loginDateTime) {
        this.loginDateTime = loginDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserLoginLog {" +
                "LoginLogId = " + loginLogId +
                ", UserName = " + userName +
                ", LoginIp = " + loginIp +
                ", LoginDateTime = " + loginDateTime + "}";
    }
}
