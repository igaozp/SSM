package endorphin.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * User 用户的实体类，存储用户基本信息
 *
 * @author igaozp
 * @version 1.1
 * @since 2016
 */
public class User implements Serializable {
    private static final long serialVersionUID = 3993708555421708579L;
    /**
     * 用户ID，数据库自增
     */
    private Integer userId;
    /**
     * 会员名称
     */
    private String userName;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 用户邮箱
     */
    private String userEmail;
    /**
     * 用户性别
     */
    private String userSex;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 用户类型
     */
    private int userType;
    /**
     * 用户状态
     */
    private int userState;
    /**
     * 用户积分
     */
    private int credit;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userSex='" + userSex + '\'' +
                ", createTime=" + createTime +
                ", userType=" + userType +
                ", userState=" + userState +
                ", credit=" + credit +
                '}';
    }
}
