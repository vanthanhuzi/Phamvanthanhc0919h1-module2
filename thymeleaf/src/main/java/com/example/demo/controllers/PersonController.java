package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {
    @Autowired
    private PersonService personService;
    @GetMapping("/a")
    public String list(Model model){
        model.addAttribute("persons", personService.findAll());
        return "list";
    }
}
