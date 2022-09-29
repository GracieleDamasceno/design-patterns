package com.example.prototype.client;

import com.example.prototype.domain.Cryptocurrency;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cryptocurrencyClient", url = "https://api.coinlore.net/api/ticker/")
public interface CryptocurrencyClient {
  @GetMapping
  List<Cryptocurrency> getCryptocurrency(@RequestParam String id);
}
