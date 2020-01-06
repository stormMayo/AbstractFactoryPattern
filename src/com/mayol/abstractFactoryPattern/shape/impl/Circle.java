package com.mayol.abstractFactoryPattern.shape.impl;

import com.mayol.abstractFactoryPattern.shape.Shape;

public class Circle implements Shape {
    @Override
    public void drow() {
        System.out.println("Inside Circle::draw() method.");
    }
}
