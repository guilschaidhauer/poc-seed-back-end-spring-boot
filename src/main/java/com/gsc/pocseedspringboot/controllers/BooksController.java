package com.gsc.pocseedspringboot.controllers;

import com.gsc.pocseedspringboot.models.Book;
import com.gsc.pocseedspringboot.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> list() {
        return bookRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Book get(@PathVariable Long id) {
        return bookRepository.getOne(id);
    }
}
