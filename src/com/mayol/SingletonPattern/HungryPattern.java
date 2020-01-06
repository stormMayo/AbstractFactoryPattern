package com.mayol.SingletonPattern;

/**
 * 饿汉式
 *
 *
 */
public class HungryPattern {
    private static HungryPattern instance = new HungryPattern();

    private HungryPattern() {
    }
    public static HungryPattern getInstance(){
        return instance;
    }

}
