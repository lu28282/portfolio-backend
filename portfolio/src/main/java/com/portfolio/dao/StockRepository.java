package com.portfolio.dao;

import com.portfolio.model.Stock;

import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock,  Long> {
    
    Stock findStockByName(String name);
}
