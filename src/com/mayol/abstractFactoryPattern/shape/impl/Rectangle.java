package com.mayol.abstractFactoryPattern.shape.impl;

import com.mayol.abstractFactoryPattern.shape.Shape;

public class Rectangle implements Shape {

    @Override
    public void drow() {
        System.out.println("Inside Rectangle::drow() method");
    }
}
