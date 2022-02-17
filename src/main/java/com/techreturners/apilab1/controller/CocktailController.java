package com.techreturners.apilab1.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.techreturners.apilab1.model.Cocktail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocktailController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/cocktails")
    public String cocktails() {
        return "Popular Cocktails";
    }

    @GetMapping("/cocktail")
    public Cocktail cocktail(@RequestParam(value = "name", defaultValue = "Pina Colada") String name) {
        return new Cocktail(counter.incrementAndGet(), name);
    }
}
