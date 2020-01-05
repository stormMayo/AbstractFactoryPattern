package com.mayol.shape.impl;

import com.mayol.shape.Shape;

public class Circle implements Shape {
    @Override
    public void drow() {
        System.out.println("Inside Circle::draw() method.");
    }
}
