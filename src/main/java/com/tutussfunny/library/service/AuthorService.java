package com.tutussfunny.library.service;

import com.tutussfunny.library.dto.AuthorDTO;
import com.tutussfunny.library.dto.AuthorSaveDTO;
import com.tutussfunny.library.dto.AuthorUpdateDTO;

import java.util.List;

public interface AuthorService {
    String addAuthor(AuthorSaveDTO authorSaveDTO);

    List<AuthorDTO> getAllAuthor();

    String updateAuthor(AuthorUpdateDTO authorUpdateDTO);

    String deleteAuthor(int id);
}
