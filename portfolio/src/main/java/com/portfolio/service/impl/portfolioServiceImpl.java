package com.portfolio.service.impl;

import com.portfolio.dao.PortfolioRepository;
import com.portfolio.model.Portfolio;
import com.portfolio.service.interfaces.portfolioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class portfolioServiceImpl implements portfolioService {

    @Autowired
    PortfolioRepository portfolioRepository;

    @Override
    public Iterable<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio getPortfolio(long portfolioId) {
        return portfolioRepository.findPortfolioById(portfolioId);
    }

    @Override
    public void removePortfolio(long portfolioId) {
        portfolioRepository.deleteById(portfolioId);
    }

    @Override
    public void save(Portfolio portfolio) {
        portfolioRepository.save(portfolio);
    }
}
