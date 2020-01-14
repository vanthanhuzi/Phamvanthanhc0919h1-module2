package com.example.demo.controller;

import com.example.demo.Entity.Mycount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycounter")
public class CounterController {
    @ModelAttribute("mycounter")
    public Mycount setUpCounter(){
        return new Mycount();
    }
    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") Mycount mycount ){
        mycount.increment();
        return "index";
    }
}
