package com.portfolio.service.interfaces;

import java.util.List;

import com.portfolio.dto.AssetDTO;

public interface assetService {
    
    public List<AssetDTO> getAllAssets();

    public AssetDTO getAsset(int assetID);

    public AssetDTO removeAsset(int assetID);
}
