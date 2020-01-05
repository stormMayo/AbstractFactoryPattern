package com.mayol.shape.impl;

import com.mayol.shape.Shape;

public class Square implements Shape {
    @Override
    public void drow() {
        System.out.println("Inside Square::draw() method");
    }
}
