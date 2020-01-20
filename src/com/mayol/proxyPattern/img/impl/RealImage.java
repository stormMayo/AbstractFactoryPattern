package com.mayol.proxyPattern.img.impl;


import com.mayol.proxyPattern.img.Image;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displying:" + fileName);
    }
    private void loadFromDisk(String fileName){
        System.out.println("Loading:" + fileName);
    }
}
