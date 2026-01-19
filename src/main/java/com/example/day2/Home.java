package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home{

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "Home";
    }

    @GetMapping("/about")
    public String about() {
        return "About";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact";
    }
}

