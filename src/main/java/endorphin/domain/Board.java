package endorphin.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Board 主题板块实体类
 *
 * @author igaozp
 * @version 1.2
 * @since 2016
 */
public class Board implements Serializable {
    private static final long serialVersionUID = -3819164942441457067L;
    /**
     * 板块ID，数据库自增
     */
    private Integer boardId;
    /**
     * 板块名称
     */
    private String boardName;
    /**
     * 板块描述
     */
    private String boardDesc;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 修改时间
     */
    private Timestamp updateTime;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + boardId +
                ", boardName='" + boardName + '\'' +
                ", boardDesc='" + boardDesc + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
