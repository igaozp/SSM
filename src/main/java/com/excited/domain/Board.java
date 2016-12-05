package com.excited.domain;

import java.io.Serializable;
import java.util.List;

public class Board implements Serializable {
    // 论坛板块属性
    private int boardId;
    private String boardName;
    private String boardDesc;
    private int boardPostNum;
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

    public int getBoardPostNum() {
        return boardPostNum;
    }

    public void setBoardPostNum(int boardPostNum) {
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
        return "Board{" +
                "boardId=" + boardId +
                ", boardName='" + boardName + '\'' +
                ", boardDesc='" + boardDesc + '\'' +
                ", boardPostNum=" + boardPostNum + "}";
    }
}
