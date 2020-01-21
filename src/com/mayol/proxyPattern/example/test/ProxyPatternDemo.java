package com.mayol.proxyPattern.example.test;

import com.mayol.proxyPattern.example.img.Image;
import com.mayol.proxyPattern.example.proxy.ProxyImage;

public class ProxyPatternDemo {
    public static void main(String[] argus){
        Image image = new ProxyImage("test_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("++++++");
        // 图像不需要从磁盘加载
        image.display();
    }
}
