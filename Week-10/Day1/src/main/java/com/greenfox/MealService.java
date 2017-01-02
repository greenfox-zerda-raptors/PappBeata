package com.greenfox;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MealService {


    private List<Meal> fakeMealStore = new ArrayList<Meal>(
            Arrays.asList(
                    new Meal("Breakfast", "Cheese croissant", 200),
                    new Meal("Lunch", "Lasagne with salmon", 500),
                    new Meal("Dinner", "Green salad with eggs", 100)));

    public List<Meal> getMeals() {
        return fakeMealStore;
    }

    public void addMeal(Meal meal) {
        if (meal.getId() == 0) {
            meal.setId(fakeMealStore.size());
        }
        fakeMealStore.add(meal);
    }
}
