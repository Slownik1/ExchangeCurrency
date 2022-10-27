package com.example.ExchangeCurrency;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Slf4j
@Component
public class HTTPConnection {

    private RestTemplate restTemplate = new RestTemplate();
    private Rate rate = new Rate();
    private final String URL ="http://api.nbp.pl/api/exchangerates/rates/A/";

    public float getReatio(String currency, float ammount){
        CurrencyDto response = restTemplate.getForObject(URL+"/{currency}/", CurrencyDto.class, currency);
        rate = response.getRates().get(0);

        return (ammount*rate.getMid());
    }

}
