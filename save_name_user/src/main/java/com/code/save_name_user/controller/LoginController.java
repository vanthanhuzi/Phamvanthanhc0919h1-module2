package com.code.save_name_user.controller;

import com.code.save_name_user.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class LoginController {
    @GetMapping("/")
    public String user(@ModelAttribute("user")User user)
}
