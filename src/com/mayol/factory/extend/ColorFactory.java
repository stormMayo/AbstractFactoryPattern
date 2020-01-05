package com.mayol.factory.extend;

import com.mayol.color.Color;
import com.mayol.color.impl.Blue;
import com.mayol.color.impl.Green;
import com.mayol.color.impl.Red;
import com.mayol.factory.AbstractFactory;
import com.mayol.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if("GREEN".equalsIgnoreCase(colorType)){
            return new Green();
        }else if("BLUE".equalsIgnoreCase(colorType)){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
