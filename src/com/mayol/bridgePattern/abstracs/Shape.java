package com.mayol.bridgePattern.abstracs;


import com.mayol.bridgePattern.impl.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
