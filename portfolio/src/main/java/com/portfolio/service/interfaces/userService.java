package com.portfolio.service.interfaces;

import java.util.List;

import com.portfolio.dto.UserDTO;

public interface userService {
    
    public List<UserDTO> getAllUsers();

    public UserDTO getUser(int id);

    public UserDTO removeUser(int id);
}
