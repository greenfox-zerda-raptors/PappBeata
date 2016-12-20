package com.greenfox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.time.LocalDate.now;

@Controller
public class HelloController {

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model, @RequestParam(defaultValue = "Thymeleaf", required = false) String name) {
        model.addAttribute("name", name);
        model.addAttribute("time", now());
        return "helloWorld";
    }
}
