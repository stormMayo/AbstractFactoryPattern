package com.mayol.chainOfResponsibilityPattern.extendsClass;


import com.mayol.chainOfResponsibilityPattern.AbstractLogger;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::ConsoleLooger" + message);
    }
}
