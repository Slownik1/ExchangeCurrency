package com.example.ExchangeCurrency;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.Arrays;

@Slf4j
@Component
public class HTTPConnection {

    private RestTemplate restTemplate = new RestTemplate();
    private Rate rate = new Rate();
    private final String URLNBP ="http://api.nbp.pl/api/exchangerates/rates/A/%s/%s";

    public float getReatio(String currency, float amount, String date){

        String URL = String.format(URLNBP, currency, date);
        CurrencyDto response = restTemplate.getForObject(URL, CurrencyDto.class, currency);
        rate = response.getRates().get(0);

        return (amount*rate.getMid());
    }

}
