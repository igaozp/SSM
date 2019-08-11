package endorphin.service.impl;

import endorphin.dao.BoardDao;
import endorphin.domain.Board;
import endorphin.service.BoardService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BoardServiceImpl
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Service
public class BoardServiceImpl implements BoardService {
    private final BoardDao boardDao;

    public BoardServiceImpl(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Override
    public void addBoardByBoard(Board board) {
        if (board != null) {
            boardDao.addBoard(board);
        }
    }

    @Override
    public List<Board> listAllBoard() {
        return boardDao.listAllBoard();
    }

    @Override
    public Board listAllPostOfBoard(int boardId) {
        return boardDao.listAllPostsOfBoard(boardId);
    }

    @Override
    public Board intoBoardByBoardId(int boardId) {
        return boardDao.findBoardByBoardId(boardId);
    }

    @Override
    public void updatePostNum(int boardId) {
        Board board = boardDao.findBoardByBoardId(boardId);
        board.setBoardPostNum(board.getBoardPostNum() + 1);
        boardDao.updateBoardByBoard(board);
    }

    @Override
    public void updateBoardInfo(Board board) {
        boardDao.updateBoardByBoard(board);
    }

    @Override
    public void deleteBoard(int boardId) {
        boardDao.deleteBoardById(boardId);
    }
}
