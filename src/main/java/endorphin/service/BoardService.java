package endorphin.service;

import endorphin.domain.Board;
import java.util.List;

/**
 * BoardService 板块功能的服务接口
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
public interface BoardService {
    /**
     * 添加板块
     *
     * @param board 新增的板块
     */
    void addBoardByBoard(Board board);

    /**
     * 通过板块名删除板块
     *
     * @param boardName 板块名
     */
    void deleteBoardByBoardName(String boardName);

    /**
     * 获取所有板块
     *
     * @return 板块列表
     */
    List<Board> listAllBoard();

    /**
     * 获取指定板块的文章
     *
     * @param boardId 板块 id
     * @return 文章列表
     */
    Board listAllPostOfBoard(int boardId);

    /**
     * 通过 id 获取板块
     *
     * @param boardId 板块 id
     * @return 查找到的板块
     */
    Board intoBoardByBoardId(int boardId);

    /**
     * 通过板块名称获取板块
     *
     * @param boardName 板块名称
     * @return 查找到的板块
     */
    Board intoBoardByBoardName(String boardName);

    /**
     * 更新板块文章数量
     *
     * @param boardId 板块 id
     */
    void updatePostNum(int boardId);

    /**
     * 更新板块信息
     *
     * @param board 板块实例
     */
    void updateBoardInfo(Board board);

    /**
     * 删除板块
     *
     * @param boardId 板块 id
     */
    void deleteBoard(int boardId);
}
