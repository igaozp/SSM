package com.excited.dao;

import com.excited.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostDao {
    public void addPost(Post post);

    public Post findPostByPostId(int postId);

    public List<Post> listAllPostInfo();

    public void deletePostById(int postId);
}
