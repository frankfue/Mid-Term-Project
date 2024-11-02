package com.example.mywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String homePage() {
        return "index"; // Refers to 'index.html' or 'index.jsp' in templates folder
    }
}
