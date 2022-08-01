package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"", "/", "index","home"})
    public String displayHomePage() {
        return "index.html";
    }

}
