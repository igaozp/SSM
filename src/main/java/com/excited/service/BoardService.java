package com.excited.service;

import com.excited.domain.Board;
import java.util.List;

public interface BoardService {
    public void addBoardByBoard(Board board);

    public void deleteBoardByBoardName(String boardName);

    public List<Board> listAllBoard();

    public Board listAllPostOfBoard(int boardId);

    public Board intoBoardByBoardId(int boardId);

    public Board intoBoardByBoardName(String boardName);

    public void updatePostNum(int boardId);

    public void updateBoardInfo(Board board);

    public void deleteBoard(int boardId);
}
