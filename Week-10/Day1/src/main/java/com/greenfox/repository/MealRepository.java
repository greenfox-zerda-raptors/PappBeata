package com.greenfox.repository;

import com.greenfox.entity.Meal;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends PagingAndSortingRepository<Meal, Long> {
    List<Meal> findAllByOrderByDateDesc();
}