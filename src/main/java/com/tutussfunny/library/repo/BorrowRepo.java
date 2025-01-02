package com.tutussfunny.library.repo;

import com.tutussfunny.library.entity.Book;
import com.tutussfunny.library.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepo extends JpaRepository<Borrow,Integer> {
}
