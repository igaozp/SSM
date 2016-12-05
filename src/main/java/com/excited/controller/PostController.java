package com.excited.controller;

import com.excited.domain.Post;
import com.excited.domain.Reply;
import com.excited.service.BoardService;
import com.excited.service.PostService;
import com.excited.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/post")
public class PostController {
    @Autowired
    PostService postService;

    @Autowired
    BoardService boardService;

    @Autowired
    ReplyService replyService;

    // 添加帖子
    @RequestMapping(value = "/addPost")
    public String addPost(Post post) {
        Post newPost = post;
        System.out.println(post.getPostBoardId());
        System.out.println(post.getPostUserName());
        System.out.println(post.getPostContent());
        Timestamp createLoginTime = new Timestamp(new Date().getTime());
        newPost.setPostCreateTime(createLoginTime);
        newPost.setPostUpdateTime(createLoginTime);

        postService.addPostByPost(newPost);
        boardService.updatePostNum(newPost.getPostBoardId());
        return "post/postMain";
    }

    // 查看帖子
    @RequestMapping(value = "postContent-{postId}")
    public String intoPost(@PathVariable int postId, HttpServletRequest request) {
        Post post = postService.listPostContent(postId);
        List<Reply> replies = replyService.listReplyByPostId(postId);
        // 根据帖子是否有回复加载相应数据
        if (replies != null) {
            request.setAttribute("replies", replies);
        }

        request.setAttribute("post", post);
        return "post/postContent";
    }
}
