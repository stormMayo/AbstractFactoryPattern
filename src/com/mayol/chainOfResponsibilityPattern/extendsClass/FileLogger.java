package com.mayol.chainOfResponsibilityPattern.extendsClass;


import com.mayol.chainOfResponsibilityPattern.AbstractLogger;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }


    @Override
    protected void write(String message) {
        System.out.println("FILE::Looger" + message);
    }
}
