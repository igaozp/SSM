package com.excited.controller;

import com.excited.domain.Reply;
import com.excited.service.ReplyService;
import com.excited.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/reply")
public class ReplyController {
    @Autowired
    ReplyService replyService;

    @Autowired
    UserService userService;

    // 添加回复
    @RequestMapping(value = "addReply", method = RequestMethod.POST)
    public String addReply(Reply reply, HttpServletRequest request) {
        replyService.addReply(reply);
        return "redirect:/post/postContent-" + reply.getReplyPostId();
    }
}
