package com.codegymdanag.casestudy.controller;

import com.codegymdanag.casestudy.entity.FuramaKhachHang;
import com.codegymdanag.casestudy.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;

    @GetMapping("/sign")
    public ModelAndView signCustomer() {
        return new ModelAndView("khachhang/sign","customer", new FuramaKhachHang());
    }
    @PostMapping("/signCustomer")
    public ModelAndView saveCustomer(@Valid @ModelAttribute(name = "customer") FuramaKhachHang furamaKhachHang,
                                     BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("khachhang/sign");
        }
        else {
            furamaKhachHang.setIdLoaiKhachHang((long) 1);
            khachHangService.saveKhachHang(furamaKhachHang);
            return new ModelAndView("dichvu/saveCustomer");
        }
    }
}
