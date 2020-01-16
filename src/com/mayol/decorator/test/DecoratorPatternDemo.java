package com.mayol.decorator.test;

import com.mayol.decorator.shape.Shape;
import com.mayol.decorator.shape.impl.Circle;
import com.mayol.decorator.shape.impl.Rectangle;
import com.mayol.decorator.shapeDecorator.ShapeDecorator;
import com.mayol.decorator.shapeDecorator.impl.RedShapeDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] argus){
        Shape circle = new Circle();
        ShapeDecorator redCircleDecorator = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangleDecorator = new RedShapeDecorator(new Rectangle());
        System.out.println("\n Circle of normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircleDecorator.draw();

        System.out.println("\nRectangle of red border");
        redRectangleDecorator.draw();
    }
    
}
