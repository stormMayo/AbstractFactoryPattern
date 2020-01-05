package com.mayol.factory;

import com.mayol.color.Color;
import com.mayol.shape.Shape;

public abstract  class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
