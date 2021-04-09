package com.portfolio.service.impl;

import com.portfolio.dao.AssetRepository;
import com.portfolio.model.Asset;
import com.portfolio.service.interfaces.assetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class assetServiceImpl implements assetService {

    @Autowired
    AssetRepository assetRepository;

    @Override
    public Iterable<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    @Override
    public Asset getAsset(long assetID) {
        return assetRepository.findAssetById(assetID);
    }

    @Override
    public void removeAsset(long assetID) {
        assetRepository.deleteById(assetID);
    }

    @Override
    public void save(Asset asset) {
        assetRepository.save(asset);
    }
}
