package com.elqessouartariq.hospitalwebjee.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SecuityController {
    @GetMapping(path = "/notAuthorized")
    public String notAuthorized(){
        return "notAuthorized";
    }

    @GetMapping(path = "/login")
    public String login(){
        return "login";
    }
}
