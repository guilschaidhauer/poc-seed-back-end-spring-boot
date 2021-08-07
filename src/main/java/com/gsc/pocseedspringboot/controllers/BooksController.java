package com.gsc.pocseedspringboot.controllers;

import com.gsc.pocseedspringboot.models.Book;
import com.gsc.pocseedspringboot.repositories.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Book create(@RequestBody final Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PATCH)
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        //TODO: Add validation
        Book existingBook = bookRepository.getOne(id);
        BeanUtils.copyProperties(book, existingBook, "id");
        return bookRepository.saveAndFlush(existingBook);
    }
}
