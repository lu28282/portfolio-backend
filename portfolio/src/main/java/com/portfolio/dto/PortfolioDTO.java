package com.portfolio.dto;

import java.util.Set;

import lombok.Data;

@Data
public class PortfolioDTO {
    private Long id;

    private String name;

    private Set<AssetDTO> asset;
}
