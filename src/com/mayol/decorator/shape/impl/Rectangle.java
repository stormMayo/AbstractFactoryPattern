package com.mayol.decorator.shape.impl;


import com.mayol.decorator.shape.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape:Rectangle");
    }
}
