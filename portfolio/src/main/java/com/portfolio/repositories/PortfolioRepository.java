package com.portfolio.repositories;

import com.portfolio.entities.Portfolio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends CrudRepository<Portfolio, Long> {
    
    Portfolio findPortfolioById(long id);

    Portfolio findPortfolioByName(String name);
}
