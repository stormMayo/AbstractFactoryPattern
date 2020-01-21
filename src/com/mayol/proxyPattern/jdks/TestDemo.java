package com.mayol.proxyPattern.jdks;

import java.lang.reflect.Proxy;

public class TestDemo {
    public static void main(String[] argus){
        SomeOne realSomeOne = new RealSomeone();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSomeOne);

        SomeOne someOne = (SomeOne) Proxy.newProxyInstance(realSomeOne.getClass().getClassLoader(), realSomeOne.getClass().getInterfaces(),
                myInvocationHandler);
        someOne.eat();
        someOne.tolite();


    }
}
