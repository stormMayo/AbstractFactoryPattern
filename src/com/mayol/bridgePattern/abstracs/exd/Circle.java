package com.mayol.bridgePattern.abstracs.exd;


import com.mayol.bridgePattern.impl.DrawAPI;
import com.mayol.bridgePattern.abstracs.Shape;

public class Circle extends Shape {
    private int x,y,radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
