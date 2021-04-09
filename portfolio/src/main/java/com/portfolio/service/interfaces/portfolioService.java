package com.portfolio.service.interfaces;

import com.portfolio.model.Portfolio;

public interface portfolioService {
    
    public Iterable<Portfolio> getAllPortfolios();

    public Portfolio getPortfolio(long portfolioId);

    public void removePortfolio(long portfolioId);

    public void save(Portfolio portfolio);
}
