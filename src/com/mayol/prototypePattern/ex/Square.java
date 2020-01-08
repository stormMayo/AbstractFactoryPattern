package com.mayol.prototypePattern.ex;

import com.mayol.prototypePattern.Shape;

public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    protected void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
