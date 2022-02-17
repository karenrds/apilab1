package com.techreturners.apilab1.model;

public class Cocktail {
    Long id;
    private String name;

    public Cocktail(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
