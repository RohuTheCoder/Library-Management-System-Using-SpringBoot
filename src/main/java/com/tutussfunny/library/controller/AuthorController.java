package com.tutussfunny.library.controller;

import com.tutussfunny.library.dto.AuthorDTO;
import com.tutussfunny.library.dto.AuthorSaveDTO;
import com.tutussfunny.library.dto.AuthorUpdateDTO;
import com.tutussfunny.library.entity.Author;
import com.tutussfunny.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping(path = "/save")
    public String saveAuthor(@RequestBody AuthorSaveDTO authorSaveDTO)
    {
        String authorName = authorService.addAuthor(authorSaveDTO);
        return "Added Successfully";
    }

    @GetMapping(path = "/getAllAuthor")
    public List<AuthorDTO> getAllAuthor()
    {
        List<AuthorDTO> allAuthors = authorService.getAllAuthor();
        return allAuthors;
    }

    @PutMapping(path = "/update")
    public String updateAuthor(@RequestBody AuthorUpdateDTO authorUpdateDTO)
    {
        String authorname = authorService.updateAuthor(authorUpdateDTO);
        return authorname;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteAuthor(@PathVariable(value = "id") int id)
    {
        String authorname = authorService.deleteAuthor(id);
        return "deleted Successfully";
    }
}
