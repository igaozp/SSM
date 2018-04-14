package endorphin.controller;

import endorphin.domain.Board;
import endorphin.domain.Post;
import endorphin.domain.User;
import endorphin.service.BoardService;
import endorphin.service.PostService;
import endorphin.service.ReplyService;
import endorphin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * AdminController
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    private final BoardService boardService;
    private final UserService userService;
    private final PostService postService;
    private final ReplyService replyService;

    @Autowired
    public AdminController(BoardService boardService, UserService userService, PostService postService, ReplyService replyService) {
        this.boardService = boardService;
        this.userService = userService;
        this.postService = postService;
        this.replyService = replyService;
    }

    /**
     * 论坛管理中心
     *
     * @param request 请求
     * @return 页面
     */
    @RequestMapping(value = "/manageCenter")
    public String manageCenter(HttpServletRequest request) {
        if (request.getSession().getAttribute("username").equals("admin")) {
            return "admin/manageCenter";
        }
        return "redirect:/error";
    }

    /**
     * 论坛版块管理中心
     *
     * @param request 请求
     * @return 页面
     */
    @RequestMapping(value = "/manageBoard")
    public String manageBoard(HttpServletRequest request) {
        if (request.getSession().getAttribute("username").equals("admin")) {
            List<Board> boards = boardService.listAllBoard();
            request.setAttribute("boards", boards);
            return "admin/manageBoard";
        }
        return "redirect:/error";
    }

    /**
     * 添加论坛板块
     *
     * @param board 新增的论坛版块
     * @param request 请求
     * @return 页面
     */
    @RequestMapping(value = "addBoard", method = RequestMethod.POST)
    public String addBoard(Board board, HttpServletRequest request) {
        if (board != null) {
            boardService.addBoardByBoard(board);
            return "redirect:/admin/manageBoard";
        }

        request.getSession().setAttribute("Msg", "添加板块出错！");
        return "admin/error";
    }

    /**
     * 修改板块信息
     *
     * @param board 修改的板块
     * @param request 请求
     * @return 页面
     */
    @RequestMapping(value = "updateBoard", method = RequestMethod.POST)
    public String updateBoard(Board board, HttpServletRequest request) {
        if (board != null) {
            boardService.updateBoardInfo(board);
            // 成功更新数据后跳转页面
            return "redirect:/admin/manageBoard";
        }

        // 更新数据失败跳转到错误页面
        return "redirect:/error";
    }

    /**
     * 管理用户信息
     *
     * @param request 请求
     * @return 页面
     */
    @RequestMapping(value = "manageUser")
    public String manageUser(HttpServletRequest request) {
        List<User> users = userService.getAllUser();
        if (users != null) {
            request.setAttribute("users", users);
            return "/admin/allUserInfo";
        }

        return "redirect:/error";
    }

    /**
     * 管理发表的主题
     *
     * @param request 请求
     * @return 页面
     */
    @RequestMapping(value = "managePost")
    public String managePost(HttpServletRequest request) {
        List<Post> posts = postService.listAllPost();
        if (posts != null) {
            request.setAttribute("posts", posts);
            return "/admin/allPostInfo";
        }

        return "redirect:/error";
    }

    /**
     * 删除已经发表的文章
     *
     * @param postId 文章 id
     * @param postBoardId 板块 id
     * @return 页面
     */
    @RequestMapping(value = "deletePost")
    public String deletePost(int postId, int postBoardId) {
        postService.deletePost(postId);
        return "redirect:/board/listPosts-" + postBoardId;
    }

    /**
     * 删除回复
     *
     * @param replyId 回复 id
     * @param replyPostId 回复的文章 id
     * @return 页面
     */
    @RequestMapping(value = "deleteReply")
    public String deleteReply(int replyId, int replyPostId) {
        replyService.deleteReply(replyId);
        return "redirect:/post/postContent-" + replyPostId;
    }

    /**
     * 删除板块
     *
     * @param boardId 板块 id
     * @return 页面
     */
    @RequestMapping(value = "deleteBoard")
    public String deleteBoard(int boardId) {
        boardService.deleteBoard(boardId);
        return "redirect:manageBoard";
    }
}
