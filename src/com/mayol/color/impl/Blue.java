package com.mayol.color.impl;

import com.mayol.color.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method");
    }
}
