package com.greenfox.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepo;

    public List<Post> getPosts() {
        List<Post> list = new ArrayList<>();
        for (Post item : postRepo.findAll()) {
            list.add(item);
        }
        return list;
    }

    public void addPost(@RequestParam String newPost) {
        postRepo.save(new Post(newPost));
    }

    public void updatePost() {
    }
}
