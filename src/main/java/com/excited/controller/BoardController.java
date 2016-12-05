package com.excited.controller;

import com.excited.domain.Board;
import com.excited.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    @Autowired
    BoardService boardService;

    // 显示相应板块的帖子
    @RequestMapping(value = "/listPosts-{boardId}")
    public String intoBoard(@PathVariable int boardId, HttpServletRequest request) {
        Board board = boardService.listAllPostOfBoard(boardId);
        request.setAttribute("board", board);
        request.setAttribute("boardId", boardId);
        return "post/postMain";
    }
}
