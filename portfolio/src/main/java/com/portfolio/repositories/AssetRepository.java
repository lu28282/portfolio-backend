package com.portfolio.repositories;

import com.portfolio.entities.Asset;

import org.springframework.data.repository.CrudRepository;

public interface AssetRepository extends CrudRepository<Asset, Long> {
    
    Asset findAssetById(long id);

    Asset findAssetByName(String name);
}
