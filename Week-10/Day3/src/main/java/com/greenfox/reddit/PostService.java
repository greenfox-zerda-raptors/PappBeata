package com.greenfox.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepo;

    @Autowired
    private UserRepository userRepo;


    public List<Post> getPosts() {

//        return postRepo.findAllOrderedByScore(new PageRequest(1, 10));
        List<Post> list = new ArrayList<>();
        for (Post item : postRepo.findAll()) {
            list.add(item);
        }
        return list;
    }

    public void addPost(String newPost) {
        Post post = new Post(newPost);
        post.setUser(userRepo.findById(1));
        postRepo.save(post);
    }

    public void updatePost() {
    }

    public void upVote(Integer id) {
        Post post = postRepo.findOne(id);
        post.setScore(post.getScore() + 1);
        postRepo.save(post);
    }

    public void downVote(Integer id) {
        Post post = postRepo.findOne(id);
        post.setScore(post.getScore() - 1);
        postRepo.save(post);
    }
}
