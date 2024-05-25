package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page handler");
        
        // Directing data to view
        model.addAttribute("name", "Rajarshi Das");
        model.addAttribute("youtubeChannel", "Rajarshi25.7");
        model.addAttribute("githubRepo", "https://github.com/RajarshiCode/");
        return "home";
    }
}
