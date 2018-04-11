package endorphin.service;

import endorphin.domain.Post;

import java.util.List;

/**
 * PostService 文章功能的服务接口
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
public interface PostService {
    /**
     * 添加文章
     *
     * @param post 新增的文章
     */
    void addPostByPost(Post post);

    /**
     * 获取文章内容
     *
     * @param postId 文章 id
     * @return 文章内容
     */
    Post listPostContent(int postId);

    /**
     * 获取所有文章
     *
     * @return 文章列表
     */
    List<Post> listAllPost();

    /**
     * 删除文章
     *
     * @param postId 文章 id
     */
    void deletePost(int postId);
}
