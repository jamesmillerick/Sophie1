package com.fyp.SpringSophie1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home() {
        return "redirect:/EventDashboard.html"; //redirects the opening page
    }
}

