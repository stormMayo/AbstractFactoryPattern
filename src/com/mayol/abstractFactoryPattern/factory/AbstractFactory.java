package com.mayol.abstractFactoryPattern.factory;

import com.mayol.abstractFactoryPattern.color.Color;
import com.mayol.abstractFactoryPattern.shape.Shape;

public abstract  class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
