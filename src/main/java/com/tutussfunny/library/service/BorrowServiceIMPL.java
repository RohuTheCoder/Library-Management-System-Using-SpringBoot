package com.tutussfunny.library.service;

import com.tutussfunny.library.dto.BookDTO;
import com.tutussfunny.library.dto.BorrowDTO;
import com.tutussfunny.library.dto.BorrowSaveDTO;
import com.tutussfunny.library.dto.BorrowUpdateDTO;
import com.tutussfunny.library.entity.Book;
import com.tutussfunny.library.entity.Borrow;
import com.tutussfunny.library.repo.BookRepo;
import com.tutussfunny.library.repo.BorrowRepo;
import com.tutussfunny.library.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowServiceIMPL implements BorrowService {
    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BorrowRepo borrowRepo;

    @Override
    public String addBorrow(BorrowSaveDTO borrowSaveDTO) {
        Borrow borrow = new Borrow(
                bookRepo.getById(borrowSaveDTO.getBook_id()),
                userRepo.getById(borrowSaveDTO.getUser_id()),
                borrowSaveDTO.getBorrowDate(),
                borrowSaveDTO.getReturnDate()
        );
        borrowRepo.save(borrow);
        return null;
    }

    @Override
    public List<BorrowDTO> getAllBorrow() {
        List<Borrow> getBorrow = borrowRepo.findAll();
        List<BorrowDTO> borrowDTOList = new ArrayList<>();

        for(Borrow borrow : getBorrow)
        {
            BorrowDTO borrowDTO = new BorrowDTO(
                    borrow.getId(),
                    borrow.getBook(),
                    borrow.getUser(),
                    borrow.getBorrowDate(),
                    borrow.getReturnDate()
            );
            borrowDTOList.add(borrowDTO);
        }
        return borrowDTOList;
    }

    @Override
    public String updateBorrow(BorrowUpdateDTO borrowUpdateDTO) {
        if(borrowRepo.existsById(borrowUpdateDTO.getId())) {
            Borrow borrow = borrowRepo.getById(borrowUpdateDTO.getId());
            borrow.setBook(bookRepo.getById(borrowUpdateDTO.getBook_id()));
            borrow.setUser(userRepo.getById(borrowUpdateDTO.getUser_id()));
            borrow.setBorrowDate(borrowUpdateDTO.getBorrowDate());
            borrow.setReturnDate(borrowUpdateDTO.getReturnDate());
            borrowRepo.save(borrow);
            return "Borrow updated successfully";
        }
        else
        {
            System.out.println("Borrow ID Not Found!!!!!");
        }
        return null;
    }
}
