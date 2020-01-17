package com.mayol.FacadePattern.faced;


import com.mayol.FacadePattern.shape.impl.Square;
import com.mayol.decorator.shape.Shape;
import com.mayol.decorator.shape.impl.Circle;
import com.mayol.decorator.shape.impl.Rectangle;

public class ShapeMaker {
    private Shape circle;
    private Shape rect;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rect = new Rectangle();
        this.square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRect(){
        rect.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
