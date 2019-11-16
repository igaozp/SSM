package endorphin.service.impl;

import endorphin.dao.BoardDao;
import endorphin.dao.PostDao;
import endorphin.domain.Board;
import endorphin.domain.Post;
import endorphin.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PostServiceImpl
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostDao postDao;
    private final BoardDao boardDao;

    @Override
    public void addPostByPost(Post post) {
        postDao.addPost(post);
    }

    @Override
    public Post listPostContent(int postId) {
        return postDao.findPostByPostId(postId);
    }

    @Override
    public List<Post> listAllPost() {
        return postDao.listAllPostInfo();
    }

    @Override
    public void deletePost(int postId) {
        // 更新Board数据
        int boardId = postDao.findPostByPostId(postId).getBoardId();
        Board board = boardDao.findBoardByBoardId(boardId);
        boardDao.updateBoardByBoard(board);

        // 删除post
        postDao.deletePostById(postId);
    }
}
