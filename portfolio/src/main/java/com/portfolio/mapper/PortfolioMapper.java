package com.portfolio.mapper;


import java.util.HashSet;
import java.util.Set;

import com.portfolio.dto.PortfolioDTO;
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
        portfolioDTO.setAsset(assetMapper.assetsToAssetDTOs(entity.getAsset()));
        return portfolioDTO;
    }

    public Set<Portfolio> portfolioDTOsToPortolios(Set<PortfolioDTO> dtos) {
        Set<Portfolio> portfolios = new HashSet<>();
        for(PortfolioDTO dto : dtos) {
            portfolios.add(portfolioDTOToPortfolio(dto));
        }
        return portfolios;
    }

    public Set<PortfolioDTO> portfoliosToPortfolioDTOs(Set<Portfolio> portfolios) {
        Set<PortfolioDTO> portfolioDTOs = new HashSet<>();
        for(Portfolio portfolio : portfolios) {
            portfolioDTOs.add(portfolioToPortfolioDTO(portfolio));
        }
        return portfolioDTOs;
    }
}
