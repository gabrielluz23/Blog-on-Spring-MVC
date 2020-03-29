package com.spring.codeBlog.service.serviceImplements;

import com.spring.codeBlog.model.Post;
import com.spring.codeBlog.repository.CodeblogRepository;
import com.spring.codeBlog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeBlogServiceImplements implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;

    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
