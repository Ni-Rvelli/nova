package com.nova.springboothello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "Hello,I'm Nova";
    }
}
