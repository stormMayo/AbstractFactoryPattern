package com.mayol.SingletonPattern;

/**
 * @author mayol
 * @data 创建时间：2020/1/6 11:47
 * @version: V1.0
 * 类说明
 */
public class SingleObject {
    //create  SingleObject
    private static SingleObject instance = new SingleObject();
    //构造函数private，类不会被实例化
    private SingleObject() {
    }
    //获取唯一可以对象
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("HELLO WORLD！");
    }

}
