package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChuyenDoiTienTe_controllers {
   @PostMapping("/convert")
    public String convert(){
       return "index";
   }
}
