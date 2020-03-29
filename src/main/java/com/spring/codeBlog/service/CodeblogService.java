package com.spring.codeBlog.service;

import com.spring.codeBlog.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
