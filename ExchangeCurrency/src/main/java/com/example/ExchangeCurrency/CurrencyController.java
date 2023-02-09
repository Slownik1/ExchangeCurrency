package com.example.ExchangeCurrency;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }
    public List<WebDTO> history = new ArrayList<WebDTO>();
    LocalDate today = LocalDate.now();

    @GetMapping("/index")
    public String Index(Model model){
        model.addAttribute("history", history);
        model.addAttribute("webDTO", new WebDTO());
        return "index";
    }

    @PostMapping("/ratio")
    public String getRatio(@ModelAttribute WebDTO webDTO){

        if(webDTO.getDate()=="")
            webDTO.setDate(today.toString());

        Float ratio = currencyService.getReatio(webDTO.getCurency(), webDTO.getAmount(), webDTO.getDate());
        webDTO.setAmountInZloty(ratio);

        history.add(webDTO);
        Collections.reverse(history);
        if(history.size()>10)
            history.remove(history.size()- history.size()+1);

        return "redirect:/index";
    }

}
