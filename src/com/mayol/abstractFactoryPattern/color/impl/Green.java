package com.mayol.abstractFactoryPattern.color.impl;

import com.mayol.abstractFactoryPattern.color.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method");
    }
}
