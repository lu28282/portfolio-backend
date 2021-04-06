package com.portfolio.repositories;

import com.portfolio.entities.Stock;

import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock,  Long> {
    
    Stock findStockByName(String name);
}
