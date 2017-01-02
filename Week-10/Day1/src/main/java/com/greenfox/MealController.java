package com.greenfox;

import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
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

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Bean
    public CommandLineRunner mealList(MealRepository repository) {
        return (args) -> {
            mealService.mealList(repository);
            log.info("");
        };
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
