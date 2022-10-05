package com.example.prototype.service;

import static com.example.prototype.mapper.CryptocurrencyDTOMapper.updateLoadedPrototypeWithCurrentValues;

import com.example.prototype.client.CryptocurrencyClient;
import com.example.prototype.domain.Cryptocurrency;
import com.example.prototype.domain.CryptocurrencyReport;
import com.example.prototype.domain.CryptocurrencyTypeEnum;
import com.example.prototype.dto.in.CryptocurrencyDTO;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CryptocurrencyService {

  private final CryptocurrencyClient cryptocurrencyClient;
  private final CryptocurrencyLoader cryptocurrencyLoader;

  public CryptocurrencyReport getCryptocurrencyReport(CryptocurrencyTypeEnum cryptocurrencyTypeEnum){
    Cryptocurrency cryptocurrencyNow = getUpdatedCryptocurrencyValues(cryptocurrencyTypeEnum);
    Cryptocurrency cryptocurrencyAtPurchase = cryptocurrencyLoader.getCryptocurrencyLoaded(
        cryptocurrencyTypeEnum);

    return CryptocurrencyReport.builder()
        .cryptocurrencyCurrentValues(cryptocurrencyNow)
        .cryptocurrencyPurchaseValues(cryptocurrencyAtPurchase)
        .rankVariation(calculateVariation(cryptocurrencyAtPurchase.getRank(), cryptocurrencyNow.getRank()))
        .priceUSDVariation(calculateVariation(cryptocurrencyAtPurchase.getPriceUSD(), cryptocurrencyNow.getPriceUSD()))
        .volume24Variation(calculateVariation(cryptocurrencyAtPurchase.getVolume24(), cryptocurrencyNow.getVolume24()))
        .marketCapUSDVariation(calculateVariation(cryptocurrencyAtPurchase.getMarketCapUSD(), cryptocurrencyNow.getMarketCapUSD()))
        .build();
  }

  private Cryptocurrency getUpdatedCryptocurrencyValues(CryptocurrencyTypeEnum cryptocurrencyTypeEnum){
    final CryptocurrencyDTO cryptocurrencyDTO = cryptocurrencyClient
        .getCryptocurrency(cryptocurrencyTypeEnum.getId()).iterator().next();

    Cryptocurrency cryptocurrencyLoaded = cryptocurrencyLoader.getCryptocurrencyLoaded(cryptocurrencyTypeEnum);

    return updateLoadedPrototypeWithCurrentValues(cryptocurrencyDTO, cryptocurrencyLoaded);
  }

  private BigDecimal calculateVariation(BigDecimal valueBefore, BigDecimal valueNow){
    return valueNow.subtract(valueBefore);
  }

  private Integer calculateVariation(Integer valueBefore, Integer valueNow){
    return valueNow - valueBefore;
  }

}
