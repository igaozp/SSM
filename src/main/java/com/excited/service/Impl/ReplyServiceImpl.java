package com.excited.service.Impl;

import com.excited.dao.ReplyDao;
import com.excited.domain.Reply;
import com.excited.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    ReplyDao replyDao;

    @Override
    public void addReply(Reply reply) {
        Reply dbReply = reply;
        dbReply.setReplyCreateTime(new Timestamp(new Date().getTime()));
        replyDao.addReply(dbReply);
    }

    @Override
    public List<Reply> listReplyByPostId(int replyPostId) {
        return replyDao.listReplyByPostId(replyPostId);
    }

    @Override
    public void deleteReply(int replyId) {
        replyDao.deleteReplyById(replyId);
    }
}
