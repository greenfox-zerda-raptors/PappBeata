package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private AtomicLong ids = new AtomicLong();

    @RequestMapping(value = "/greeting", params = {"name"})
    public Greeting Greeting(@RequestParam("name") String username) {
        return new Greeting(ids.incrementAndGet(), "Buenos Días " + username);
    }

}
