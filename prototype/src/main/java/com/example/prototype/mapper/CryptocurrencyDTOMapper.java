package com.example.prototype.mapper;

import com.example.prototype.domain.Cryptocurrency;
import com.example.prototype.dto.in.CryptocurrencyDTO;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CryptocurrencyDTOMapper {

  public static Cryptocurrency updateLoadedPrototypeWithCurrentValues(CryptocurrencyDTO cryptocurrencyDTO, Cryptocurrency cryptocurrencyLoaded){
    cryptocurrencyLoaded.setRank(cryptocurrencyDTO.getRank());
    cryptocurrencyLoaded.setPriceUSD(cryptocurrencyDTO.getPriceUSD());
    cryptocurrencyLoaded.setVolume24(cryptocurrencyDTO.getVolume24());
    cryptocurrencyLoaded.setMarketCapUSD(cryptocurrencyDTO.getMarketCapUSD());
    return cryptocurrencyLoaded;
  }

}
