package com.greenfox.controller;

import com.greenfox.entity.Meal;
import com.greenfox.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/caloriecounter")
public class MealController {

    MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @RequestMapping(value = {"/", ""})
    public String index(Model model) {
        model.addAttribute("meals", mealService.getMeals());
        return "index";
    }

    @GetMapping("/addMeal")
    public String addMeal(Model model) {
        model.addAttribute("meal", new Meal());
        return "addMeal";
    }

    @PostMapping("/addMeal")
    public String addMealSubmit(@ModelAttribute Meal meal) {
        mealService.addMeal(meal);
        return "redirect:/caloriecounter";
    }

    @GetMapping(value = "/{id}/edit", params = "edit")
    public String editMeal(Model model, Meal meal) {
        model.addAttribute("meal", meal);
        return "editMeal";
    }

    @PostMapping("/{id}/edit")
    public String editMealSubmit(@PathVariable Meal meal) {
        mealService.editMeal(meal);
        return "redirect:/caloriecounter";
    }
}
