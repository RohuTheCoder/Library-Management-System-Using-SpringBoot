package com.tutussfunny.library.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tutussfunny.library.entity.Book;
import com.tutussfunny.library.entity.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
public class BorrowDTO {

    @JsonProperty("borrowid")
    private int id;

    @JsonProperty("book")
    private Book book;

    @JsonProperty("user")
    private User user;

    @JsonProperty("borrowDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate borrowDate;

    @JsonProperty("returnDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;

    public BorrowDTO(int id, Book book, User user, LocalDate borrowDate, LocalDate returnDate) {
        this.id = id;
        this.book = book;
        this.user = user;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
}
