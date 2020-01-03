package com.codegymdanag.casestudy.controller;

import com.codegymdanag.casestudy.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    DichVuService dichVuService;
    @GetMapping("/")
    public ModelAndView getHomePage(@RequestParam(value = "fromPrice", required = false) Integer fromFrice
            ,@RequestParam(value = "toPrice",required = false) Integer toPrice){
        ModelAndView modelAndView = new ModelAndView("home/index");
        if(fromFrice == null || toPrice == null){
            modelAndView.addObject("listservice", dichVuService.getAllService());
        }
        else {
            modelAndView.addObject("listservice", dichVuService.getAllDependentPrice(fromFrice, toPrice));
        }
        return modelAndView;
    }
    @GetMapping("/dichvu/{id}")
    public ModelAndView showDichVuDetail(@PathVariable("id") Long id){
       return new ModelAndView("dichvu/detail",
                "dichvuDetail", dichVuService.findById(id));


    }

}
