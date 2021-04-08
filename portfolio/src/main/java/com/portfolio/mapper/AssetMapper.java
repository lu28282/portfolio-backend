package com.portfolio.mapper;

import com.portfolio.dto.AssetDTO;
import com.portfolio.model.Crypto;
import com.portfolio.model.Stock;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface AssetMapper {
    @Mappings({
        @Mapping(target="id", source="entity.id"),
        @Mapping(target="name", source="entity.name"),
        @Mapping(target="amount", source="entity.amount"),
        @Mapping(target="isin", source="entity.isin"),
      })
      AssetDTO stockToAssetDTO(Stock entity);
    
      @Mappings({
        @Mapping(target="id", source="entity.id"),
        @Mapping(target="name", source="entity.name"),
        @Mapping(target="amount", source="entity.amount"),
        @Mapping(target="abbreviation", source="entity.abbreviation"),
      })
      AssetDTO cryptoToAssetDTO(Crypto entity);
      
      @Mappings({
        @Mapping(target="id", source="entity.id"),
        @Mapping(target="name", source="entity.name"),
        @Mapping(target="amount", source="entity.amount"),
        @Mapping(target="isin", source="entity.isin"),
      })
      Stock stockDTOtoStock(AssetDTO dto);
      
      @Mappings({
        @Mapping(target="id", source="entity.id"),
        @Mapping(target="name", source="entity.name"),
        @Mapping(target="amount", source="entity.amount"),
        @Mapping(target="abbreviation", source="entity.abbreviation"),
      })
      Crypto cryptoDTOtoStock(AssetDTO dto);
}
