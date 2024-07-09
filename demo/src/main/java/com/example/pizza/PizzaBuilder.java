package com.example.pizza;

import java.util.UUID;

public interface PizzaBuilder {
    public PizzaBuilder setId(UUID value);
    public PizzaBuilder setName(String value);
    public PizzaBuilder setDescription(String value);
    public PizzaBuilder setUrl(String value);
    public Pizza build();      
}