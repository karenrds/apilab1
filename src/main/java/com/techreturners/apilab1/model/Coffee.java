package com.techreturners.apilab1.model;

public class Coffee {
    Long id;
    private String name;

    public Coffee(long id, String name) {
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
