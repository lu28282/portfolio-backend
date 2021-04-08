package com.portfolio.mapper;

import com.portfolio.dto.PortfolioDTO;
import com.portfolio.model.Portfolio;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface PortfolioMapper {
    @Mappings({
        @Mapping(target="id", source="entity.id"),
        @Mapping(target="name", source="entity.name"),
        @Mapping(target="asset", source="entity.asset")
      })
      PortfolioDTO portfolioToPortfolioDTO(Portfolio entity);
      
      @Mappings({
        @Mapping(target="id", source="dto.id"),
        @Mapping(target="name", source="dto.name"),
        @Mapping(target="asset", source="dto.asset")
      })
      Portfolio portfolioDTOtoPortfolio(PortfolioDTO dto);
}
