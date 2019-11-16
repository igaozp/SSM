package endorphin.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * UserLoginLog 用户登录日志的实体类
 *
 * @author igaozp
 * @version 1.2
 * @since 2016
 */
@Data
public class UserLoginLog implements Serializable {
    private static final long serialVersionUID = -9055667212150869380L;
    /**
     * 用户登录记录ID，数据库自增
     */
    private Long loginLogId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 登录IP
     */
    private String ip;
    /**
     * 登录时间
     */
    private Timestamp loginTime;
}
