package endorphin.controller;

import endorphin.domain.Board;
import endorphin.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * MainController
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Controller
public class MainController {
    private final BoardService boardService;

    @Autowired
    public MainController(BoardService boardService) {
        this.boardService = boardService;
    }

    /**
     * 主页
     *
     * @return 主页
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 显示内容主页
     *
     * @param request 请求
     * @return 返回页面
     */
    @RequestMapping("/main")
    public String mainPage(HttpServletRequest request) {
        List<Board> boards = boardService.listAllBoard();
        request.setAttribute("board", boards);
        return "mainPage";
    }

    /**
     * 显示用户登录页面
     *
     * @return 返回页面
     */
    @RequestMapping("/userLogin")
    public String userLogin() {
        return "user/userLogin";
    }

    /**
     * 显示注册页面
     *
     * @return 返回页面
     */
    @RequestMapping("/userRegister")
    public String userRegister() {
        return "user/userRegister";
    }

    /**
     * 显示添加文章的页面
     *
     * @param userName 用户名
     * @param boardId  板块 id
     * @param request  请求
     * @return 返回页面
     */
    @RequestMapping("addPost")
    public String addPost(String userName, String boardId, HttpServletRequest request) {
        if (userName != null && boardId != null) {
            request.setAttribute("username", userName);
            request.setAttribute("boardId", boardId);

            return "/post/addPost";
        }

        return "redirect:/error";
    }

    /**
     * 显示添加回复的页面
     *
     * @param replyPostId   回复的文章的 id
     * @param replyUserName 回复用户的姓名
     * @param request       请求
     * @return 返回页面
     */
    @RequestMapping("addReply")
    public String addReply(int replyPostId, String replyUserName, HttpServletRequest request) {
        if (replyPostId > 0 && replyUserName != null) {
            request.setAttribute("replyPostId", replyPostId);
            request.setAttribute("replyUserName", replyUserName);

            return "reply/reply";
        }
        return "redirect:/error";
    }

    /**
     * 显示添加板块的页面
     *
     * @return 返回页面
     */
    @RequestMapping(value = "addBoard")
    public String addBoardPage() {
        return "/admin/addBoard";
    }

    /**
     * 显示板块
     *
     * @param boardId 板块 id
     * @param request 请求
     * @return 返回页面
     */
    @RequestMapping(value = "updateBoardPage")
    public String updateBoardPage(int boardId, HttpServletRequest request) {
        Board board = boardService.intoBoardByBoardId(boardId);
        if (board != null) {
            request.setAttribute("boardName", board.getBoardName());
            request.setAttribute("boardDesc", board.getBoardDesc());
            request.setAttribute("boardId", board.getBoardId());
            request.setAttribute("boardPostNum", board.getBoardPostNum());
            return "/admin/updateBoard";
        }

        return "/admin/updateBoard";
    }

    /**
     * 错误页面
     *
     * @return 返回错误页面
     */
    @RequestMapping(value = "error")
    public String error() {
        return "error";
    }
}
