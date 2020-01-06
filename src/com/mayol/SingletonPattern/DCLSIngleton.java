package com.mayol.SingletonPattern;

public class DCLSIngleton {
    private volatile static DCLSIngleton singleton;

    private DCLSIngleton() {
    }
    public static DCLSIngleton getInstance(){
        if(singleton == null){
            synchronized (DCLSIngleton.class){
                if(singleton == null){
                    singleton = new DCLSIngleton();
                }
            }
        }
        return singleton;
    }
}
