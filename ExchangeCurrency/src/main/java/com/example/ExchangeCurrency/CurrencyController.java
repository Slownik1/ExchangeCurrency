package com.example.ExchangeCurrency;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/ratio")
    public float getRatio(@RequestParam(name = "currency") String currency, @RequestParam(name = "ammount") float ammount){
        return currencyService.getReatio(currency, ammount);
    }

}
