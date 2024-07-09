package com.example.pizza;

import java.util.UUID;

public class Ingredient extends EntityBase{

    private String name;
    private Double price;

    protected Ingredient(UUID id, String name, Double price){
        super(id);

    }

    //eventos
    public void update(String name, double price){
        this.name = name;
        this.price = price;
    }

    //eventos
    public Ingredient create(UUID id, String name, Double price){
        return new Ingredient(id, name, price);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
    
}
