package endorphin.domain;

import java.sql.Timestamp;
import java.util.List;

/**
 * Post 文章实体类
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
public class Post {
    /**
     * 文章的基本属性
     */
    private User user;
    private int postId;
    private int postBoardId;
    private String postUserName;
    private String postTitle;
    private String postContent;
    private int postGoodCount;
    private int postBadCount;
    private int postViewCount;
    private int postReplyCount;
    private int postStatus;
    private Timestamp postCreateTime;
    private Timestamp postUpdateTime;
    private List<Reply> replies;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostBoardId() {
        return postBoardId;
    }

    public void setPostBoardId(int postBoardId) {
        this.postBoardId = postBoardId;
    }

    public String getPostUserName() {
        return postUserName;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public int getPostGoodCount() {
        return postGoodCount;
    }

    public void setPostGoodCount(int postGoodCount) {
        this.postGoodCount = postGoodCount;
    }

    public int getPostBadCount() {
        return postBadCount;
    }

    public void setPostBadCount(int postBadCount) {
        this.postBadCount = postBadCount;
    }

    public int getPostViewCount() {
        return postViewCount;
    }

    public void setPostViewCount(int postViewCount) {
        this.postViewCount = postViewCount;
    }

    public int getPostReplyCount() {
        return postReplyCount;
    }

    public void setPostReplyCount(int postReplyCount) {
        this.postReplyCount = postReplyCount;
    }

    public int getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(int postStatus) {
        this.postStatus = postStatus;
    }

    public Timestamp getPostCreateTime() {
        return postCreateTime;
    }

    public void setPostCreateTime(Timestamp postCreateTime) {
        this.postCreateTime = postCreateTime;
    }

    public Timestamp getPostUpdateTime() {
        return postUpdateTime;
    }

    public void setPostUpdateTime(Timestamp postUpdateTime) {
        this.postUpdateTime = postUpdateTime;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    @Override
    public String toString() {
        return "Post {" +
                "postId = " + postId +
                ", postBoardId = " + postBoardId +
                ", postUserName = '" + postUserName + '\'' +
                ", postTitle = '" + postTitle + '\'' +
                ", postContent = '" + postContent + '\'' +
                ", postGoodCount = " + postGoodCount +
                ", postBadCount = " + postBadCount +
                ", postViewCount = " + postViewCount +
                ", postReplyCount = " + postReplyCount +
                ", postStatus = " + postStatus +
                ", postCreateTime = " + postCreateTime +
                ", postUpdateTime = " + postUpdateTime + '}';
    }
}
