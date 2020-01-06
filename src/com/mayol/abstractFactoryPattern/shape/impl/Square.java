package com.mayol.abstractFactoryPattern.shape.impl;

import com.mayol.abstractFactoryPattern.shape.Shape;

public class Square implements Shape {
    @Override
    public void drow() {
        System.out.println("Inside Square::draw() method");
    }
}
