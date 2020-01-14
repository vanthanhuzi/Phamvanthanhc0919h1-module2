package com.codegym.bt_quanlikhachhang_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/hello")
    public String hihi(){
        return "hello";
    }
}
