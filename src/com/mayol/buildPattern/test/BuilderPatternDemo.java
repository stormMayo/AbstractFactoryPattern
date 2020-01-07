package com.mayol.buildPattern.test;

import com.mayol.buildPattern.meal.Meal;
import com.mayol.buildPattern.mealBuilder.MealBuilder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("+++++++++++++++++++");

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();

    }
}
