package com.web.springmvcboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        System.out.println("Home Page");
        return "home"; // Maps to /views/home.jsp
    }

}
