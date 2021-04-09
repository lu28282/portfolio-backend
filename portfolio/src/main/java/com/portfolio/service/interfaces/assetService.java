package com.portfolio.service.interfaces;


import com.portfolio.model.Asset;

public interface assetService {
    
    public Iterable<Asset> getAllAssets();

    public Asset getAsset(long assetId);

    public void removeAsset(long assetId);

    public void save(Asset asset);
}
