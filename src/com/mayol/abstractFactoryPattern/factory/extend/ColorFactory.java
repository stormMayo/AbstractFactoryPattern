package com.mayol.abstractFactoryPattern.factory.extend;

import com.mayol.abstractFactoryPattern.color.Color;
import com.mayol.abstractFactoryPattern.color.impl.Blue;
import com.mayol.abstractFactoryPattern.color.impl.Green;
import com.mayol.abstractFactoryPattern.color.impl.Red;
import com.mayol.abstractFactoryPattern.factory.AbstractFactory;
import com.mayol.abstractFactoryPattern.shape.Shape;

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
