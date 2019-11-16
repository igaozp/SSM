package endorphin.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Reply 回复实体类
 *
 * @author igaozp
 * @version 1.1
 * @since 2016
 */
@Data
public class Reply implements Serializable {
    private static final long serialVersionUID = -5852618533340752085L;
    /**
     * 文章回复ID，数据库自增
     */
    private Integer replyId;
    /**
     * 文章ID
     */
    private Integer postId;
    /**
     * 回复内容
     */
    private String content;
    /**
     * 回复喜欢的数量
     */
    private Integer like;
    /**
     * 回复不喜欢的数量
     */
    private Integer unLike;
    /**
     * 创建时间
     */
    private Timestamp createTime;
}
