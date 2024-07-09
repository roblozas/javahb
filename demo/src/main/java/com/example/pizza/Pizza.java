package com.example.pizza;

import java.util.UUID;

/* 
pizza{
    id,
    name,
    description,
    url,
    precio->solo lectura->sum(precio-ingredients) * 1.2
    ingredients: [{id,name,precio}]
}
    */


public class Pizza extends EntityBase{
    
    private String name;
    private Ingredient ingredient[];

    protected Pizza(UUID id, String name, Ingredient ingredient[]){
        super(id);

    }

    //eventos
    public void update(String name, Ingredient ingredient[]){
        this.name = name;
        this.ingredient[] = ingredient[];
    }

    //eventos
    public Pizza create(UUID id, String name, Ingredient[] ingredient){
        return new Pizza(id, name,ingredient[]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient[] ingredient) {
        this.ingredient = ingredient;
    }
}
