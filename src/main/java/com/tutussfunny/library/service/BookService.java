package com.tutussfunny.library.service;

import com.tutussfunny.library.dto.BookDTO;
import com.tutussfunny.library.dto.BookSaveDTO;
import com.tutussfunny.library.dto.BookUpdateDTO;

import java.util.List;

public interface BookService {
    String addBook(BookSaveDTO bookSaveDTO);

    List<BookDTO> getAllBook();

    String updateBook(BookUpdateDTO bookUpdateDTO);

    String deleteBook(int id);
}
