package com.sqs.jokeme;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting() {
        return "Habedere! This is Joke-me!";
    }
}
