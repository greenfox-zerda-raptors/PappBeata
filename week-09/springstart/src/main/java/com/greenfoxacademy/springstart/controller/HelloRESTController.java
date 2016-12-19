package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting", params = {"name"})
    public Greeting Greeting(@RequestParam("name") String username) {
        return new Greeting(1, "Buenos Días " + username);
    }

}
