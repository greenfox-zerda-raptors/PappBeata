package com.greenfox.Controller;

import com.greenfox.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caloriecounter")
public class MealController {

    @Autowired
    MealService mealService;

    @RequestMapping(value = {"/", ""})
    public String index(Model model) {
        model.addAttribute("mealService", mealService.getMeals());
        return "index";
    }


}
