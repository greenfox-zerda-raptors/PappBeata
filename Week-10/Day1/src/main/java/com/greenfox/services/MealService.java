package com.greenfox.services;

import com.greenfox.entity.Meal;
import com.greenfox.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    private MealRepository mealRepo;

    @Autowired
    public MealService(MealRepository mealRepo) {
        this.mealRepo = mealRepo;
    }

    public List<Meal> getMeals() {
        return mealRepo.findAllByOrderByDateDesc();
    }


/*    public void addMeal(Meal meal) {
        if (meal.getId() == 0) {
            meal.setId(fakeMealStore.size());
        }
        fakeMealStore.add(meal);
    }*/
}
