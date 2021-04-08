package com.portfolio.mapper;

import com.portfolio.dto.UserDTO;
import com.portfolio.model.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface UserMapper {
    @Mappings({
        @Mapping(target="id", source="entity.id"),
        @Mapping(target="username", source="entity.username"),
        @Mapping(target="password", source="entity.password"),
        @Mapping(target="portfolio", source="entity.portfolio")
      })
      UserDTO userToUserDTO(User entity);
      
      @Mappings({
        @Mapping(target="id", source="dto.id"),
        @Mapping(target="username", source="dto.username"),
        @Mapping(target="password", source="dto.password"),
        @Mapping(target="portfolio", source="dto.portfolio")
      })
      User userDTOtoUser(UserDTO dto);
}
