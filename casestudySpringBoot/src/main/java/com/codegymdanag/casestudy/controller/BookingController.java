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

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
                                    @RequestParam(value = "ngayketthuc") String ngayketthuc) throws ParseException {

        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        Date dateStart = formatter1.parse(ngaybatdau);
        Date dateEnd = formatter1.parse(ngayketthuc);
        FuramaHopDong furamaHopDong = new FuramaHopDong();
        furamaHopDong.setIdDichVu(id);
        furamaHopDong.setNgayKetThuc(dateEnd);
        furamaHopDong.setNgayLamHopDong(dateStart);
        furamaHopDong.setIdKhachHang((long) 1);
        furamaHopDong.setIdNhanVien((long) 1);
        hopdongService.saveHopDong(furamaHopDong);
        ModelAndView modelAndView = new ModelAndView("dichvu/bookingSuccess");
        return modelAndView;
    }
}
