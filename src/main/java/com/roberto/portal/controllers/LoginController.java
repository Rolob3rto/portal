package com.roberto.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class LoginController {

    
    @RequestMapping(value = "/login")
    public String login() {
    
        return "login";
    }

    @GetMapping(value="/welcome")
    public String welcome() {
        return "welcome";
    }
    
    
}
