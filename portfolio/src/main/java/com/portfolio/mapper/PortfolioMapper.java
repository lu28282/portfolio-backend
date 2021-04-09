package com.portfolio.mapper;

import java.util.HashSet;
import java.util.Set;

import com.portfolio.dto.AssetDTO;
import com.portfolio.dto.PortfolioDTO;
import com.portfolio.enumeration.AssetType;
import com.portfolio.model.Asset;
import com.portfolio.model.Portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PortfolioMapper {
    
    @Autowired
    AssetMapper assetMapper;

    public Portfolio portfolioDTOToPortfolio(PortfolioDTO dto) {
        Portfolio portfolio = new Portfolio();
        portfolio.setId(dto.getId());
        portfolio.setName(dto.getName());
        portfolio.setAsset(assetMapper.assetDTOsToAssets(dto.getAsset()));

        return portfolio;
    }

    public PortfolioDTO portfolioToPortfolioDTO(Portfolio entity) {
        PortfolioDTO portfolioDTO = new PortfolioDTO();
        portfolioDTO.setId(entity.getId());
        portfolioDTO.setName(entity.getName());
        // portfolioDTO.setAsset(assetMapper.);
        return portfolioDTO;
    }

    
}
