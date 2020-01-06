package com.mayol.abstractFactoryPattern.producer;

import com.mayol.abstractFactoryPattern.factory.AbstractFactory;
import com.mayol.abstractFactoryPattern.factory.extend.ColorFactory;
import com.mayol.abstractFactoryPattern.factory.extend.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if("SHAPe".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }else if("COLOR".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
