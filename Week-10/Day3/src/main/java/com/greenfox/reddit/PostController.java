package com.greenfox.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("postService", postService.getPosts());
        return "index";
    }

    @GetMapping(value = "/add")
    public String addContentForm(Model model) {
        model.addAttribute("post", new Post());
        return "add";
    }

    @PostMapping(value = "/add")
    public String addContentSubmit(@ModelAttribute Post post) {
        postService.addPost(post.content);
        return "submit";
    }
}
