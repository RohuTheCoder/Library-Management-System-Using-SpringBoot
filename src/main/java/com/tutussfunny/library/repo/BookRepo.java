package com.tutussfunny.library.repo;

import com.tutussfunny.library.entity.Author;
import com.tutussfunny.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
