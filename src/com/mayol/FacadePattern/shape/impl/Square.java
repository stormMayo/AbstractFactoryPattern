package com.mayol.FacadePattern.shape.impl;


import com.mayol.decorator.shape.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square：+++draw Square");
    }
}
