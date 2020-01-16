package com.mayol.decorator.shapeDecorator.impl;

import com.mayol.decorator.shape.Shape;
import com.mayol.decorator.shapeDecorator.ShapeDecorator;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBorder(decoratedShape);
    }
    private void setBlueBorder(Shape decoratedShape){
        System.out.println("Border color::=== Blue");
    }
}
