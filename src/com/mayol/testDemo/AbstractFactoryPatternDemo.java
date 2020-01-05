package com.mayol.testDemo;

import com.mayol.color.Color;
import com.mayol.factory.AbstractFactory;
import com.mayol.producer.FactoryProducer;
import com.mayol.shape.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //TEST1  ------获取形状为circle的对象
        Shape circle = shapeFactory.getShape("CIRCLE");
        //调用circle的draw方法
        circle.drow();

        //TEST2-----
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.drow();

        //TEST3-----
        Shape square = shapeFactory.getShape("SQUARE");
        square.drow();

        //获取颜色工厂
        AbstractFactory color = FactoryProducer.getFactory("COLOR");

        //TETS1+++++++

        Color red = color.getColor("RED");
        red.fill();

        //TETS2+++++++
        Color green = color.getColor("GREEN");
        green.fill();

        //TEST3+++++++
        Color blue = color.getColor("BLue");
        blue.fill();
    }
}
