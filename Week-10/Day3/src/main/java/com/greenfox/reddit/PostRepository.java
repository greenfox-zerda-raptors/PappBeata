package com.greenfox.reddit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Integer> {

    public Page<Post> findAllByOrderByScoreDesc(Pageable pageable);
}
