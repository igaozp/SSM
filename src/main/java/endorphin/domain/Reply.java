package endorphin.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Reply 回复实体类
 *
 * @author igaozp
 * @version 1.1
 * @since 2016
 */
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

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getUnLike() {
        return unLike;
    }

    public void setUnLike(Integer unLike) {
        this.unLike = unLike;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", postId=" + postId +
                ", content='" + content + '\'' +
                ", like=" + like +
                ", unLike=" + unLike +
                ", createTime=" + createTime +
                '}';
    }
}
