package com.example.ExchangeCurrency;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.Date;

@Data
public class WebDTO {

    private String curency;
    @NotEmpty(message = "This field can not be less than 0 or empty !")
    @NotNull(message = "This field can not be less than 0 or empty !")
    private Float amount;
    private String date;
    private Float amountInZloty;

}
