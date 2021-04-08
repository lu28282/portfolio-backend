package com.portfolio.config.initialisation;

import java.util.HashSet;
import java.util.Set;

import com.portfolio.model.Asset;
import com.portfolio.model.Crypto;
import com.portfolio.model.Portfolio;
import com.portfolio.model.Stock;
import com.portfolio.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseDataInitialiser {
    @Autowired
    private InitRepositoryWrapper initRepositoryWrapper;

    public void initialiseDbTables() {
        Crypto btc = initRepositoryWrapper.createCryptoIfNotFound("Bitcoin", 1d, "BTC");
        Crypto bnb = initRepositoryWrapper.createCryptoIfNotFound("Binancecoin", 16.4, "BNB");
        Stock etf = initRepositoryWrapper.createStockIfNotFound("ETF XY", 2.5, "Random String");
        Stock alianz = initRepositoryWrapper.createStockIfNotFound("Alianz", 2d, "Randoas dasas");

        Set<Asset> assets = new HashSet<>();
        assets.add(btc);
        assets.add(bnb);
        assets.add(etf);
        assets.add(alianz);
        Portfolio portfolio1 = initRepositoryWrapper.creatPortfolioIfNotFound("Portfolio 1", null);
        Portfolio portfolio2 = initRepositoryWrapper.creatPortfolioIfNotFound("Portfolio 2", assets);

        Set<Portfolio> portfolios = new HashSet<>();
        portfolios.add(portfolio1);
        portfolios.add(portfolio2);
        User user1 = initRepositoryWrapper.creatUserIfNotFound("Larissa", "password", null);
        User user2 = initRepositoryWrapper.creatUserIfNotFound("Luca", "password", portfolios);
    }
}
