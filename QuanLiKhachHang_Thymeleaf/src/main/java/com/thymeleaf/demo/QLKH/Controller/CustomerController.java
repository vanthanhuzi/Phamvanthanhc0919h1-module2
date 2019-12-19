package com.thymeleaf.demo.QLKH.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.thymeleaf.demo.QLKH.Model.Customer;
import com.thymeleaf.demo.QLKH.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
private CustomerService customerService ;
@GetMapping("/")
    public String index(Model model){
    model.addAttribute("customers", customerService.findAll());
    return "index";
}
@GetMapping("/customer/create")
    public String create(Model model){
    model.addAttribute("customer", new Customer());
    return "create";
}
    @PostMapping("/customer/save")
    public String save(Customer customer,RedirectAttributes redirect) {
        customer.setId((int)(Math.random() * 10000));
        customerService.save(customer);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/deleted")
    public String deleted(@PathVariable("id") int id, RedirectAttributes  redirectAttributes){
    customerService.remove(id);
    redirectAttributes.addFlashAttribute("success", "ok ");
    return "redirect:/";
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model){
    model.addAttribute("customer", customerService.findById(id));
    return "edit";
    }
    @PostMapping("/customer/update")
    public String update(Customer customer, RedirectAttributes redirect) {
        customerService.update(customer.getId(), customer);
        redirect.addFlashAttribute("success", "Modified customer successfully!");
        return "redirect:/";
    }
//    @PostMapping("/customer/deleted")
//    public String remove(Customer customer, RedirectAttributes redirect){
//    customerService.remove(customer.getId());
//    redirect.addFlashAttribute("success", "deleted Successfully");
//    return "redirect:/";
//    }
}
