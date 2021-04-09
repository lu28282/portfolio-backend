package com.portfolio.mapper;

import com.portfolio.dto.UserDTO;
import com.portfolio.model.User;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    
    public UserDTO userToUserDTO(User entity) {
        UserDTO userDto = new UserDTO();
        userDto.setId(entity.getId());
        userDto.setUsername(entity.getUsername());
        userDto.setPassword(entity.getUsername());
        // userDto.setPortfolio(entity.getPortfolio());

        return userDto;
    }
}
