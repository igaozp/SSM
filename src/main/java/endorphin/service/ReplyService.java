package endorphin.service;

import endorphin.domain.Reply;

import java.util.List;

/**
 * ReplyService 回复功能的服务接口
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
public interface ReplyService {
    /**
     * 添加回复
     *
     * @param reply 回复实例
     */
    void addReply(Reply reply);

    /**
     * 获取指定文章的回复
     *
     * @param postId 文章 id
     * @return 回复列表
     */
    List<Reply> listReplyByPostId(int postId);

    /**
     * 删除回复
     *
     * @param replyId 回复 id
     */
    void deleteReply(int replyId);
}
