package endorphin.dao;

import endorphin.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * BoardDao 提供了了关于主题板块的操作接口
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Repository
public interface BoardDao {
    /**
     * 添加主题板块
     *
     * @param board 主题板块实例
     */
    void addBoard(Board board);

    /**
     * 获取所有的主题板块
     *
     * @return 主题板块列表
     */
    List<Board> listAllBoard();

    /**
     * 获取指定板块的所有文章
     *
     * @param boardId 指定的板块 id
     * @return 文章列表
     */
    Board listAllPostsOfBoard(int boardId);

    /**
     * 通过主题板块 id 查找板块
     *
     * @param boardId 指定的板块 id
     * @return 查找到的板块
     */
    Board findBoardByBoardId(int boardId);

    /**
     * 通过板块名称查找板块
     *
     * @param boardName 板块名称
     * @return 查找到的板块
     */
    Board findBoardByBoardName(String boardName);

    /**
     * 更新板块信息
     *
     * @param board 更新的板块实例
     */
    void updateBoardByBoard(Board board);

    /**
     * 通过 id 删除板块
     *
     * @param boardId 板块 id
     */
    void deleteBoardById(int boardId);
}
