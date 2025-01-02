package com.tutussfunny.library.service;

import com.tutussfunny.library.dto.BorrowDTO;
import com.tutussfunny.library.dto.BorrowSaveDTO;
import com.tutussfunny.library.dto.BorrowUpdateDTO;

import java.util.List;

public interface BorrowService {
    String addBorrow(BorrowSaveDTO borrowSaveDTO);

    List<BorrowDTO> getAllBorrow();

    String updateBorrow(BorrowUpdateDTO borrowUpdateDTO);
}
