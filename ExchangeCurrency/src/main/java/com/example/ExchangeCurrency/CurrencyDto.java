package com.example.ExchangeCurrency;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
public class CurrencyDto {

    private String table;
    private ArrayList<Rate> rates;

}
