package com.mayol.buildPattern.food.impl;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Cold Drink";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
