package com.mayol.producer;

import com.mayol.factory.AbstractFactory;
import com.mayol.factory.extend.ColorFactory;
import com.mayol.factory.extend.ShapeFactory;

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
