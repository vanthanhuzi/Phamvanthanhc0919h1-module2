package com.example.thi.controller;

import com.example.thi.entity.Book;
import com.example.thi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public String getAllBook(Model model, @PageableDefault(size = 10) Pageable pageable
            , @RequestParam(value = "masach", required = false) String masach)
                             {
        Page<Book> books;
        if (masach != null) {
            books = bookService.findAllByMaSachLike(masach, pageable);
            model.addAttribute("look", masach);
        }
        else {
            books = bookService.findAll(pageable);
        }
//        } if  (tensach != null) {
//            books = bookService.findAllByNameBookLike(masach, pageable);
//
//        }

        model.addAttribute("listBook", books);
        return "index";
    }
    @GetMapping("/createBook")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create", "book", new Book());
        return modelAndView;
    }

    @PostMapping("/create-book")
    public ModelAndView saveBook(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult) {

            bookService.saveBook(book);
            ModelAndView modelAndView = new ModelAndView("create");
            modelAndView.addObject("book", book);
            modelAndView.addObject("message", "Customer Book successfully");
            return modelAndView;

    }

//    @PostMapping("/create-book")
//    public ModelAndView createBook(@ModelAttribute("book") Book book) {
//        bookService.saveBook(book);
//        ModelAndView modelAndView = new ModelAndView("create");
//        modelAndView.addObject("book", new Book());
//        modelAndView.addObject("message", "New Book created successfully");
//        return modelAndView;
//    }

    @GetMapping("/edit-book/{id}")
    public ModelAndView showEdit(@PathVariable("id") Long id) {
        Book book = bookService.findById(id);

            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("book", book);
            return modelAndView;
    }


    @GetMapping("/delete-book/{id}")
    public ModelAndView showDeleteForm(@PathVariable("id") Long id) {
        Book book = bookService.findById(id);

            ModelAndView modelAndView = new ModelAndView("deleted");
            modelAndView.addObject("book", book);
            return modelAndView;
    }
    @PostMapping("/delete-book")
    public String deleteCustomer(@ModelAttribute("book") Book book){
        bookService.deletedById(book.getId());
        return "index";
    }
}
