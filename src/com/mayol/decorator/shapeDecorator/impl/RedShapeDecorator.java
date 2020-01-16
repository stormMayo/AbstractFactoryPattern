package com.mayol.decorator.shapeDecorator.impl;


import com.mayol.decorator.shape.Shape;
import com.mayol.decorator.shapeDecorator.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        this.setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border color::=== Red");
    }
}
