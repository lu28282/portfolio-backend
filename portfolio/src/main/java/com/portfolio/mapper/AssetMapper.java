package com.portfolio.mapper;

import java.util.HashSet;
import java.util.Set;

import com.portfolio.dto.AssetDTO;
import com.portfolio.enumeration.AssetType;
import com.portfolio.model.Asset;
import com.portfolio.model.Crypto;
import com.portfolio.model.Stock;

import org.springframework.stereotype.Component;

@Component
public class AssetMapper {

    public AssetDTO cryptoToAssetDTO(Crypto entity) {
        AssetDTO assetDTO = new AssetDTO();
        assetDTO.setId(entity.getId());
        assetDTO.setName(entity.getName());
        assetDTO.setAssetType(AssetType.CRYPTO);
        assetDTO.setAbbreviation(entity.getAbbreviation());
        assetDTO.setAmount(entity.getAmount());

        return assetDTO;
    }

    public AssetDTO stockToAssetDTO(Stock entity) {
        AssetDTO assetDTO = new AssetDTO();
        assetDTO.setId(entity.getId());
        assetDTO.setName(entity.getName());
        assetDTO.setAssetType(AssetType.STOCK);
        assetDTO.setAmount(entity.getAmount());
        assetDTO.setIsin(entity.getIsin());

        return assetDTO;
    }

    public Crypto AssetDTOToCrypto(AssetDTO dto) {
        Crypto crypto = new Crypto();
        crypto.setId(dto.getId());
        crypto.setName(dto.getName());
        crypto.setAmount(dto.getAmount());
        crypto.setAbbreviation(dto.getAbbreviation());

        return crypto;
    }

    public Stock AssetDTOToStock(AssetDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setAmount(dto.getAmount());
        stock.setIsin(dto.getIsin());

        return stock;
    }

    public Set<Asset> assetDTOsToAssets(Set<AssetDTO> assetDTOs) {
        Set<Asset> assets = new HashSet<Asset>();
        for (AssetDTO assetDTO : assetDTOs) {
            if (assetDTO.getAssetType() == AssetType.CRYPTO) {
                assets.add(this.AssetDTOToCrypto(assetDTO));
            } else if (assetDTO.getAssetType() == AssetType.STOCK) {
                assets.add(this.AssetDTOToStock(assetDTO));
            }
        }
        return assets;
    }

    public Set<AssetDTO> assetsToAssetDTOs(Set<Asset> assets) {
        Set<AssetDTO> assetDTOs = new HashSet<AssetDTO>();
        for (Asset asset : assets) {
            if (asset.getAssetType() == AssetType.CRYPTO.getValue()) {
                assetDTOs.add(cryptoToAssetDTO((Crypto) asset));
            } else if (asset.getAssetType() == AssetType.STOCK.getValue()) {
                assetDTOs.add(stockToAssetDTO((Stock) asset));
            }
        }
        return assetDTOs;
    }
}
