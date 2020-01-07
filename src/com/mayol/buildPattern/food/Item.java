package com.mayol.buildPattern.food;

import com.mayol.buildPattern.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();

}
