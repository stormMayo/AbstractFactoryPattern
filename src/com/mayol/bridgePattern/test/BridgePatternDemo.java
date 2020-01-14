package com.mayol.bridgePattern.test;

import com.mayol.bridgePattern.abstracs.Shape;
import com.mayol.bridgePattern.abstracs.exd.Circle;
import com.mayol.bridgePattern.impl.GreenCircle;
import com.mayol.bridgePattern.impl.RedCircle;

public class BridgePatternDemo {
    public static void main(String[] argus){
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 50);
        Shape greenCircle = new Circle(new GreenCircle(),500,500,100);
        redCircle.draw();
        greenCircle.draw();
    }
    
}
