package com.mayol.factory.extend;

import com.mayol.color.Color;
import com.mayol.factory.AbstractFactory;
import com.mayol.shape.Shape;
import com.mayol.shape.impl.Circle;
import com.mayol.shape.impl.Rectangle;
import com.mayol.shape.impl.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return  null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return  new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
