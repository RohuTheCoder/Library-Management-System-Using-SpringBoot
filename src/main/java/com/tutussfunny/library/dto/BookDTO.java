package com.tutussfunny.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tutussfunny.library.entity.Author;
import com.tutussfunny.library.entity.Publisher;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BookDTO {

    @JsonProperty("bookid")
    private int bookid;

    @JsonProperty("title")
    private String title;

    @JsonProperty("author")
    private Author author;

    @JsonProperty("publisher")
    private Publisher publisher;

    public BookDTO(int bookid, String title, Author author, Publisher publisher) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
}
