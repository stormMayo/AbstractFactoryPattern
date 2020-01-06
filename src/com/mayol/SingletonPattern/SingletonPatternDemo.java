package com.mayol.SingletonPattern;

/**
 * @author mayol
 * @data 创建时间：2020/1/6 11:50
 * @version: V1.0
 * 类说明
 */
public class SingletonPatternDemo {
    public static void main(String[] argus){
        //error
//        SingleObject object = new SingleObject();
        //获取唯一可用对象
        SingleObject instance = SingleObject.getInstance();
        //显示消息
        instance.showMessage();

    }
}

