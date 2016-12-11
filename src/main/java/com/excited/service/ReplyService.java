package com.excited.service;

import com.excited.domain.Reply;

import java.util.List;

public interface ReplyService {
    public void addReply(Reply reply);

    public List<Reply> listReplyByPostId(int postId);

    public void deleteReply(int replyId);
}
