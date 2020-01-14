package com.codegymdanag.casestudy.controller;

import com.codegymdanag.casestudy.entity.FuramaHopDong;
import com.codegymdanag.casestudy.entity.Furamadichvu;
import com.codegymdanag.casestudy.service.DichVuService;
import com.codegymdanag.casestudy.service.HopdongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@Controller
public class BookingController {

    @Autowired
    HopdongService hopdongService;
    @Autowired
    DichVuService dichVuService;

    @GetMapping("/booking/{id}")
    public ModelAndView getBooking(@PathVariable(value = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("dichvu/booking");
        Furamadichvu furamadichvu = dichVuService.findById(id);
        modelAndView.addObject("dichvu", furamadichvu);
        return modelAndView;
    }

    @PostMapping("/booking")
    public ModelAndView saveBooking(@RequestParam(value = "id") Long id,
                                    @RequestParam(value = "ngaybatdau") String ngaybatdau,
                                    @RequestParam(value = "ngayketthuc") String ngayketthuc, HttpServletRequest request,
                                    HttpServletResponse response) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = format.parse(ngaybatdau);
        Date endDate = format.parse(ngayketthuc);
        FuramaHopDong furamaHopDong = new FuramaHopDong();
        furamaHopDong.setIdDichVu(id);
        furamaHopDong.setNgayKetThuc(startDate);
        furamaHopDong.setNgayLamHopDong(endDate);
        furamaHopDong.setIdKhachHang((long) 1);
        furamaHopDong.setIdNhanVien((long) 1);
        hopdongService.saveHopDong(furamaHopDong);
        Iterable<FuramaHopDong> listHopDong = hopdongService.findAllByIdKhachHang((long)1);
        for(FuramaHopDong hopDong: listHopDong){
            String cookieValue = hopDong.getId() + "_" + hopDong.getIdDichVu() + "_" + ngaybatdau+
                    "_"+ngayketthuc;
            Cookie cookie = new Cookie("hopDong" +hopDong.getId(), cookieValue);
            cookie.setMaxAge(60*60*24);
            cookie.setPath("/history");
            response.addCookie(cookie);
         //   System.out.println(cookieValue);
        }

        return new ModelAndView("dichvu/bookingSuccess");
    }
}
