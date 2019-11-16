package endorphin.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * User 用户的实体类，存储用户基本信息
 *
 * @author igaozp
 * @version 1.1
 * @since 2016
 */
@Data
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
}
