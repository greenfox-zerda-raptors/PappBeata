package com.greenfox;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MealService {

    private List<Meal> fakeMealStore = Arrays.asList(new Meal("Breakfast", "Cheese croissant", 200),
            new Meal("Lunch", "Lasagne with salmon", 500),
            new Meal("Dinner", "Green salad with eggs", 100));

    public void mealList(MealRepository repository) {
        repository.save(new Meal("Breakfast", "Cheese croissant", 200));
        repository.save(new Meal("Lunch", "Lasagne with salmon", 500));

        for (Meal item : fakeMealStore) {
            System.out.println(item.description);
        }
    }

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
