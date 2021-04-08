package com.portfolio.dto;

import com.portfolio.enumeration.AssetType;

import lombok.Data;

@Data
public class AssetDTO {
    private Long id;

    private String name;

    private double amount;

    private AssetType assetType;

    private String abbreviation;

    private String isin;
}
