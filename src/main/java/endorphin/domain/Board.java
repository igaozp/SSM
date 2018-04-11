package endorphin.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Board 主题板块实体类
 *
 * @author igaozp
 * @version 1.1
 * @since 2016
 */
public class Board implements Serializable {
    /**
     * 板块 id
     */
    private int boardId;
    /**
     * 板块名称
     */
    private String boardName;
    /**
     * 板块描述
     */
    private String boardDesc;
    /**
     * 板块文章数量
     */
    private long boardPostNum;
    /**
     * 文章列表
     */
    private List<Post> posts;

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardDesc() {
        return boardDesc;
    }

    public void setBoardDesc(String boardDesc) {
        this.boardDesc = boardDesc;
    }

    public long getBoardPostNum() {
        return boardPostNum;
    }

    public void setBoardPostNum(long boardPostNum) {
        this.boardPostNum = boardPostNum;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Board {" +
                "boardId = " + boardId +
                ", boardName = '" + boardName + '\'' +
                ", boardDesc = '" + boardDesc + '\'' +
                ", boardPostNum = " + boardPostNum + "}";
    }
}
