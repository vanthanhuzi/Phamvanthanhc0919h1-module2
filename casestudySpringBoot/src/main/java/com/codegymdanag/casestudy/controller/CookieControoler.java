package com.codegymdanag.casestudy.controller;

import com.codegymdanag.casestudy.entity.FuramaHopDong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CookieControoler {
    @GetMapping("/history")
    public ModelAndView getHistoryPage(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("dichvu/history");
        Cookie[]  cookies = request.getCookies();

        List<FuramaHopDong> hopDongList = new ArrayList<>();
        for (int i = 0; i < cookies.length; i++) {
            if(cookies[i].getName().contains("hopDong")){
                FuramaHopDong furamaHopDong = new FuramaHopDong();
                String[] cookieValue = cookies[i].getValue().split("\\_");
                furamaHopDong.setId(Long.parseLong(cookieValue[0]));
                furamaHopDong.setIdDichVu(Long.parseLong(cookieValue[1]));
                furamaHopDong.setNgayLamHopDong(Date.valueOf(cookieValue[2]));
                furamaHopDong.setNgayKetThuc(Date.valueOf(cookieValue[3]));
                hopDongList.add(furamaHopDong);
            }
        }
        modelAndView.addObject("historyHopDong", hopDongList);
return modelAndView;
    }
}
