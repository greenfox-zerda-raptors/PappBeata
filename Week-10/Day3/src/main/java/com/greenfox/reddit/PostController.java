package com.greenfox.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping(value = {"/", ""})
    public String index(Model model) {
        model.addAttribute("posts", postService.getPosts());
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

    @RequestMapping(value = "/{postId}/upVote", method = RequestMethod.GET)
    public String upVote(@PathVariable("postId") Integer id) {
        postService.upVote(id);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{postId}/downVote", method = RequestMethod.GET)
    public String downVote(@PathVariable("postId") Integer id) {
        postService.downVote(id);
        return "redirect:/posts";

    }
}
