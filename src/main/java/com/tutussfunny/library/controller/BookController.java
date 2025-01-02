package com.tutussfunny.library.controller;


import com.tutussfunny.library.dto.*;
import com.tutussfunny.library.service.BookService;
import com.tutussfunny.library.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(path = "/save")
    public String saveBook(@RequestBody BookSaveDTO bookSaveDTO)
    {
        String booktitle = bookService.addBook(bookSaveDTO);
        return "Added Successfully";
    }

    @GetMapping(path = "/getAllBook")
    public List<BookDTO> getAllBook()
    {
        List<BookDTO> allBooks = bookService.getAllBook();
        return allBooks;
    }

    @PutMapping(path = "/update")
    public String updateBook(@RequestBody BookUpdateDTO bookUpdateDTO)
    {
        String bookname = bookService.updateBook(bookUpdateDTO);
        return bookname;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteBook(@PathVariable(value = "id") int id)
    {
        String bookname = bookService.deleteBook(id);
        return "deleted Successfully";
    }
}