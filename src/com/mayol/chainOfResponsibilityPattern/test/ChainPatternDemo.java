package com.mayol.chainOfResponsibilityPattern.test;

import com.mayol.chainOfResponsibilityPattern.AbstractLogger;
import com.mayol.chainOfResponsibilityPattern.extendsClass.ConsoleLogger;
import com.mayol.chainOfResponsibilityPattern.extendsClass.ErrorLogger;
import com.mayol.chainOfResponsibilityPattern.extendsClass.FileLogger;

public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){
//        3
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
//        2
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
//        1
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] argus){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "++++This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "++++This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "++++This is an error information.");
    }
}
