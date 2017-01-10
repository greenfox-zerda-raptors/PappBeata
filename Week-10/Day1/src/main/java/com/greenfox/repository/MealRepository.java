package com.greenfox.repository;

import com.greenfox.entity.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends Page<Meal, Integer> {
    List<Meal> findById(Integer id);
}