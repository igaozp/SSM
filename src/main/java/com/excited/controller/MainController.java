package com.excited.controller;

import com.excited.domain.Board;
import com.excited.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    BoardService boardService;

    // 显示主页
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // 显示内容主页
    @RequestMapping("/main")
    public String mainPage(HttpServletRequest request) {
        List<Board> boards = boardService.listAllBoard();
        request.setAttribute("board", boards);
        return "mainPage";
    }

    // 显示用户登录页面
    @RequestMapping("/userLogin")
    public String userLogin() {
        return "user/userLogin";
    }

    // 显示注册页面
    @RequestMapping("/userRegister")
    public String userRegister() {
        return "user/userRegister";
    }

    @RequestMapping("addPost")
    public String addPost(String userName, String boardId, HttpServletRequest request) {
        if (userName != null && boardId != null) {
            request.setAttribute("username", userName);
            request.setAttribute("boardId", boardId);

            return "/post/addPost";
        }

        return "redirect:/error";
    }

    @RequestMapping("addReply")
    public String addReply(int replyPostId, String replyUserName, HttpServletRequest request) {
        if (replyPostId > 0 && replyUserName != null) {
            request.setAttribute("replyPostId", replyPostId);
            request.setAttribute("replyUserName", replyUserName);

            return "reply/reply";
        }
        return "redirect:/error";
    }

    // 显示添加板块的页面
    @RequestMapping(value = "addBoard")
    public String addBoardPage() {
        return "/admin/addBoard";
    }

    // 显示板块
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

    @RequestMapping(value = "error")
    public String error() {
        return "error";
    }
}
