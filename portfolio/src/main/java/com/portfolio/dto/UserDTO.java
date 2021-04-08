package com.portfolio.dto;

import java.util.Set;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;

    private String username;

    private String password;

    private Set<PortfolioDTO> portfolio;
}
