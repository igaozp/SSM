package endorphin.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Post 文章实体类
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Data
public class Post implements Serializable {
    private static final long serialVersionUID = -3969503478861556288L;
    /**
     * 文章ID，数据库自增
     */
    private Integer postId;
    /**
     * 会员ID
     */
    private Integer userId;
    /**
     * 文章板块ID
     */
    private Integer boardId;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 文章喜欢数
     */
    private Integer like;
    /**
     * 文章不喜欢数
     */
    private Integer unLike;
    /**
     * 文章浏览量
     */
    private Integer viewCount;
    /**
     * 文章状态
     */
    private int postStatus;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 修改时间
     */
    private Timestamp updateTime;
}
