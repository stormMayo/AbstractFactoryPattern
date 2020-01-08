package com.mayol.prototypePattern.ex;

import com.mayol.prototypePattern.Shape;

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }
    @Override
    protected void draw() {
        System.out.println("Inside Circle:: draw() method");

    }
}
