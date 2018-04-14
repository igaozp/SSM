package endorphin.controller;

import endorphin.domain.Board;
import endorphin.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * BoardController
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Controller
@RequestMapping(value = "/board")
public class BoardController {
    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    /**
     * 显示指定板块的文章
     *
     * @param boardId 板块 id
     * @param request 请求
     * @return 返回页面
     */
    @RequestMapping(value = "/listPosts-{boardId}")
    public String intoBoard(@PathVariable int boardId, HttpServletRequest request) {
        Board board = boardService.listAllPostOfBoard(boardId);
        request.setAttribute("board", board);
        request.setAttribute("boardId", boardId);
        return "post/postMain";
    }
}
