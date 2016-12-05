package com.excited.service;

import com.excited.domain.Post;

import java.util.List;

public interface PostService {
    public void addPostByPost(Post post);

    public Post listPostContent(int postId);

    public List<Post> listAllPost();
}
