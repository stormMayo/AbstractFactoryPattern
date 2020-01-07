package com.mayol.buildPattern.mealBuilder;

import com.mayol.buildPattern.food.impl.ChickenBurger;
import com.mayol.buildPattern.food.impl.Coke;
import com.mayol.buildPattern.food.impl.Pepsi;
import com.mayol.buildPattern.food.impl.VegBurger;
import com.mayol.buildPattern.meal.Meal;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
