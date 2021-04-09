package com.portfolio.mapper;

import com.portfolio.dto.UserDTO;
import com.portfolio.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    PortfolioMapper portfolioMapper;
    
    public UserDTO userToUserDTO(User entity) {
        UserDTO userDto = new UserDTO();
        userDto.setId(entity.getId());
        userDto.setUsername(entity.getUsername());
        userDto.setPassword(entity.getUsername());
        userDto.setPortfolio(portfolioMapper.portfoliosToPortfolioDTOs(entity.getPortfolio()));

        return userDto;
    }

    public User UserDTOToUser(UserDTO dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setPortfolio(portfolioMapper.portfolioDTOsToPortolios(dto.getPortfolio()));

        return user;
    }
}
