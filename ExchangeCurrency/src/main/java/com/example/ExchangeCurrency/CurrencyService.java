package com.example.ExchangeCurrency;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CurrencyService {

    public final HTTPConnection httpConnection;

    public float getReatio(String currency, float amount, String date){
        return httpConnection.getReatio(currency, amount, date);
    }

}
