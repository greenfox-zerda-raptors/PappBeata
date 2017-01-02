package com.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caloriecounter")
public class MealController {

    MealService mealService;

    public MealController() {
        mealService = new MealService();
    }

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("mealService", mealService.getMeals());
        return "index";
    }
}
