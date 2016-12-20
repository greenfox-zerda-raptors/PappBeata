package com.greenfox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @RequestMapping("/list")
    public String list() {
        return "list";
    }

}
