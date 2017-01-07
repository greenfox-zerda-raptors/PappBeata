package com.greenfox.reddit;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {

    //Page<Post> findAllOrderedByScore(Pageable pageable);
}
