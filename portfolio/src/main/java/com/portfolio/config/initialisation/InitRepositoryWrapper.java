package com.portfolio.config.initialisation;

import java.util.Set;

import javax.transaction.Transactional;

import com.portfolio.entities.Asset;
import com.portfolio.entities.Crypto;
import com.portfolio.entities.Portfolio;
import com.portfolio.entities.Stock;
import com.portfolio.entities.User;
import com.portfolio.repositories.AssetRepository;
import com.portfolio.repositories.CryptoRepository;
import com.portfolio.repositories.PortfolioRepository;
import com.portfolio.repositories.StockRepository;
import com.portfolio.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitRepositoryWrapper {

    private UserRepository userRepository;

    private PortfolioRepository portfolioRepository;

    private AssetRepository assetRepository;

    private CryptoRepository cryptoRepository;

    private StockRepository stockRepository;

    @Autowired
    public InitRepositoryWrapper(UserRepository userRepository, PortfolioRepository portfolioRepository,
            AssetRepository assetRepository, CryptoRepository cryptoRepository, StockRepository stockRepository) {
        this.userRepository = userRepository;
        this.portfolioRepository = portfolioRepository;
        this.assetRepository = assetRepository;
        this.cryptoRepository = cryptoRepository;
        this.stockRepository = stockRepository;
    }

    @Transactional
    public User creatUserIfNotFound(String username, String password, Set<Portfolio> portfolios) {
        User user = userRepository.findUserByUsername(username);
        if (user == null) {
            user = new User();
            user.setUsername(username);
            user.setPassword(password);

            if (portfolios != null) {
                user.setPortfolio(portfolios);
            }

            user = userRepository.save(user);
        }
        return user;
    }

    @Transactional
    public Portfolio creatPortfolioIfNotFound(String name, Set<Asset> assets) {
        Portfolio portfolio = portfolioRepository.findPortfolioByName(name);
        if (portfolio == null) {
            portfolio = new Portfolio();
            portfolio.setName(name);

            if (assets != null) {
                portfolio.setAsset(assets);
            }

            portfolio = portfolioRepository.save(portfolio);
        }
        return portfolio;
    }

    @Transactional
    public Crypto createCryptoIfNotFound(String name, Double ammount, String abbreviation) {
        Crypto crypto = cryptoRepository.findCryptoByName(name);
        if (crypto == null) {
            crypto = new Crypto();
            crypto.setName(name);
            crypto.setAmount(ammount);
            crypto.setAbbreviation(abbreviation);

            crypto = cryptoRepository.save(crypto);
        }
        return crypto;
    }

    @Transactional
    public Stock createStockIfNotFound(String name, Double ammount, String isin) {
        Stock stock = stockRepository.findStockByName(name);
        if (stock == null) {
            stock = new Stock();
            stock.setName(name);
            stock.setAmount(ammount);
            stock.setIsin(isin);

            stock = stockRepository.save(stock);
        }
        return stock;
    }
}
