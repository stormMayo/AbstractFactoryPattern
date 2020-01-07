package com.mayol.buildPattern.food.impl;

import com.mayol.buildPattern.food.Item;
import com.mayol.buildPattern.packing.Packing;
import com.mayol.buildPattern.packing.impl.Wrapper;

public abstract class Bugger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
