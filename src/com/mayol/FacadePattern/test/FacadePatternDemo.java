package com.mayol.FacadePattern.test;

import com.mayol.FacadePattern.faced.ShapeMaker;

public class FacadePatternDemo {
    public static void main(String[] argus){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRect();
        shapeMaker.drawSquare();
    }

}
