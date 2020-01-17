package com.mayol.FacadePattern.shape.impl;


import com.mayol.decorator.shape.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle：+++draw circle");
    }
}
