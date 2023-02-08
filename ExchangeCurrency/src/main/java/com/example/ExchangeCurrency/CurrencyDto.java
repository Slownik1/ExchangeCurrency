package com.example.ExchangeCurrency;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
public class CurrencyDto {

    private String table;
    private ArrayList<Rate> rates;

}
