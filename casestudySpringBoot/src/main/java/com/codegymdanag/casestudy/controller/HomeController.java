package com.codegymdanag.casestudy.controller;

import com.codegymdanag.casestudy.entity.FuramaFavorite;
import com.codegymdanag.casestudy.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("favorite")
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
    @GetMapping("/favorite/{id}")
    public String saveFuramaFavorite(@PathVariable("id") Long id,
                                     @ModelAttribute("favorite") FuramaFavorite sessionFavorite){
        sessionFavorite.add(dichVuService.findById(id));
        return "redirect:/";

    }
    @GetMapping("/favoritePage")
    public String showFavorite(){
        return "home/favorite";
    }
@ModelAttribute("favorite")
    public FuramaFavorite setupSession(){
        return new FuramaFavorite();
}
}
