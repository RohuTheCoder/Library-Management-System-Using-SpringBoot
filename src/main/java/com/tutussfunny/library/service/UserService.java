package com.tutussfunny.library.service;

import com.tutussfunny.library.dto.UserDTO;
import com.tutussfunny.library.dto.UserSaveDTO;
import com.tutussfunny.library.dto.UserUpdateDTO;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUser();

    String updateUser(UserUpdateDTO userUpdateDTO);

    String deleteUser(int id);
}
