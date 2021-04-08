package com.portfolio.service.interfaces;

import java.util.List;

import com.portfolio.dto.PortfolioDTO;

public interface portfolioService {
    
    public List<PortfolioDTO> getAllPortfolios(int userID);

    public PortfolioDTO getPortfolio(int portfolioID);

    public PortfolioDTO removePortfolio(int portfolioID);
}
