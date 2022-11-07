package com.cog.Edureka_Module19_Assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/welcome")
    public String sendWelcomeMessage(){
        return "Welcome to TataConsultancyServices";
    }
}
