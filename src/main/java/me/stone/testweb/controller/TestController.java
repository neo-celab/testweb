package me.stone.testweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test1")
    public String test1(){
        return "test1.html";
    }

    @GetMapping("/test2")
    public String test2(){
        return "test2.html";
    }
}
