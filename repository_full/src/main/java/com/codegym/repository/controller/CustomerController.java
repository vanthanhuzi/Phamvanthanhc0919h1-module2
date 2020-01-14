package com.codegym.repository.controller;

import com.codegym.repository.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public ModelAndView getAllCustomer(){
        return new ModelAndView("customer/list", "customer", customerService.getAllCustomer());
    }
}
