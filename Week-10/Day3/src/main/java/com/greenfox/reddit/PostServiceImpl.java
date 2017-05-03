package com.greenfox.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepo;

    @Autowired
    private UserRepository userRepo;

    @Transactional(readOnly = true)
    public Page<Post> getAllPosts(Pageable pageable) {
        return postRepo.findAllByOrderByScoreDesc(new PageRequest(1, 10));
    }

    public void addPost(String newPost) {
        Post post = new Post(newPost);
        post.setUser(userRepo.findById(1));
        postRepo.save(post);
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
