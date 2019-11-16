package endorphin.service.impl;

import endorphin.dao.PostDao;
import endorphin.dao.ReplyDao;
import endorphin.domain.Post;
import endorphin.domain.Reply;
import endorphin.service.ReplyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * ReplyServiceImpl
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Service
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService {
    private final ReplyDao replyDao;
    private final PostDao postDao;

    @Override
    public void addReply(Reply reply) {
        // 更新post信息
        Reply dbReply = reply;
        int postId = reply.getPostId();
        Post post = postDao.findPostByPostId(postId);
        postDao.updatePostByPost(post);

        // 添加回复
        dbReply.setCreateTime(new Timestamp(System.currentTimeMillis()));
        replyDao.addReply(dbReply);
    }

    @Override
    public List<Reply> listReplyByPostId(int replyPostId) {
        return replyDao.listReplyByPostId(replyPostId);
    }

    @Override
    public void deleteReply(int replyId) {
        // 更新post信息
        Reply reply = replyDao.findReplyByReplyId(replyId);
        Post post = postDao.findPostByPostId(reply.getPostId());
        postDao.updatePostByPost(post);

        // 删除回复
        replyDao.deleteReplyById(replyId);
    }
}
