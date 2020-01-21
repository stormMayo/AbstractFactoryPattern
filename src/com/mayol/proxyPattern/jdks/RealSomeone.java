package com.mayol.proxyPattern.jdks;

public class RealSomeone implements SomeOne{

    @Override
    public String eat() {
        System.out.println("eat");
        return "Andrew1";
    }

    @Override
    public String tolite() {
        System.out.println("pee");
        return "Andrew2";
    }
}
