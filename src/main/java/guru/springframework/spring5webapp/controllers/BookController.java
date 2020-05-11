package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author  : ISJC
 * Modified: 5/11/2020 3:40 PM
 * Copyright 2020. All Rights Reserved by Compsource Mutual
 */
@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
/* 
    Author  : ISJC 
    Modified: 5/11/2020 3:40 PM 
    Copyright 2020. All Rights Reserved by Compsource Mutual 
*/ 