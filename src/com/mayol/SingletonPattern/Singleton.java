package com.mayol.SingletonPattern;

/**
 * 单例模式：
 * 懒汉式  线程不安全
 * 缺点：线程不安全,不支持多线程  未加锁 synchronized
 */

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }
//    public static Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
    //加锁  线程安全
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
