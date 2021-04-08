package com.portfolio.dao;

import com.portfolio.model.Crypto;

import org.springframework.data.repository.CrudRepository;

public interface CryptoRepository extends CrudRepository<Crypto,  Long> {
    
    Crypto findCryptoById(long id);

    Crypto findCryptoByName(String name);
}
