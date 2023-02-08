package com.example.ExchangeCurrency;

import lombok.Data;

import java.util.Date;

@Data
public class WebDTO {

    private String curency;
    private Float amount;
    private String date;
    private Float amountInZloty;

}
