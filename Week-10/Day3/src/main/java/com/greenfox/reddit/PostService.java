package com.greenfox.reddit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {
    Page<Post> getAllPosts(Pageable pageable);

}
