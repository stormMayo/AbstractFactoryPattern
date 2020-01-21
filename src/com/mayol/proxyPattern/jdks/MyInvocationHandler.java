package com.mayol.proxyPattern.jdks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * self definition handler
 */
public class MyInvocationHandler implements InvocationHandler {
    SomeOne realSomeOne;

    public MyInvocationHandler(SomeOne realSomeOne) {
        this.realSomeOne = realSomeOne;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("transfer proxy class>>>>>>>>>>>>");
        if("eat".equalsIgnoreCase(method.getName())){
            String invoke = (String)method.invoke(realSomeOne, args);
            System.out.println("The method is invoked to eat");
            System.out.println("================================");

            return invoke;
        }else{
            String invoke = (String)method.invoke(realSomeOne, args);
            System.out.println("The method is invoked to tolite");
            System.out.println("================================");
            return invoke;
        }
    }
}
