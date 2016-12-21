package com.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoService todoService;

    public TodoController() {
        todoService = new TodoService();
    }

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todoService", todoService.getTodos());
        return "list";
    }
}
