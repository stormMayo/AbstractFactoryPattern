package com.mayol.buildPattern.food.impl;

import com.mayol.buildPattern.food.Item;
import com.mayol.buildPattern.packing.Packing;
import com.mayol.buildPattern.packing.impl.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
