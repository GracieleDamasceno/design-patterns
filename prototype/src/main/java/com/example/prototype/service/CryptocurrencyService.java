package com.example.prototype.service;

import static com.example.prototype.mapper.CryptocurrencyDTOMapper.updateLoadedPrototypeWithCurrentValues;

import com.example.prototype.client.CryptocurrencyClient;
import com.example.prototype.domain.Cryptocurrency;
import com.example.prototype.domain.CryptocurrencyReport;
import com.example.prototype.domain.CryptocurrencyTypesEnum;
import com.example.prototype.dto.in.CryptocurrencyDTO;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CryptocurrencyService {

  private final CryptocurrencyClient cryptocurrencyClient;
  private final CryptocurrencyLoader cryptocurrencyLoader;

  public CryptocurrencyReport getCryptocurrencyReport(CryptocurrencyTypesEnum cryptocurrencyTypesEnum){
    Cryptocurrency cryptocurrencyNow = getUpdatedCryptocurrencyValues(cryptocurrencyTypesEnum);
    Cryptocurrency cryptocurrencyAtPurchase = cryptocurrencyLoader.getCryptocurrencyLoaded(cryptocurrencyTypesEnum);

    return CryptocurrencyReport.builder()
        .cryptocurrencyNow(cryptocurrencyNow)
        .cryptocurrencyAtPurchase(cryptocurrencyAtPurchase)
        .variationOfRank(calculateVariation(cryptocurrencyAtPurchase.getRank(), cryptocurrencyNow.getRank()))
        .variationOfPriceUSD(calculateVariation(cryptocurrencyAtPurchase.getPriceUSD(), cryptocurrencyNow.getPriceUSD()))
        .variationOfVolume24(calculateVariation(cryptocurrencyAtPurchase.getVolume24(), cryptocurrencyNow.getVolume24()))
        .variationOfMarketCapUSD(calculateVariation(cryptocurrencyAtPurchase.getMarketCapUSD(), cryptocurrencyNow.getMarketCapUSD()))
        .build();
  }

  private Cryptocurrency getUpdatedCryptocurrencyValues(CryptocurrencyTypesEnum cryptocurrencyTypesEnum){
    final CryptocurrencyDTO cryptocurrencyDTO = cryptocurrencyClient
        .getCryptocurrency(cryptocurrencyTypesEnum.getId()).iterator().next();

    Cryptocurrency cryptocurrencyLoaded = cryptocurrencyLoader.getCryptocurrencyLoaded(
        cryptocurrencyTypesEnum);
    return updateLoadedPrototypeWithCurrentValues(cryptocurrencyDTO, cryptocurrencyLoaded);
  }

  private BigDecimal calculateVariation(BigDecimal valueBefore, BigDecimal valueNow){
    return valueNow.subtract(valueBefore);
  }

  private Integer calculateVariation(Integer valueBefore, Integer valueNow){
    return valueNow - valueBefore;
  }

}
