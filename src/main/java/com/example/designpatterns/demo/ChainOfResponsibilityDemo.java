package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.chainofresponsibility.DebugLogger;
import com.example.designpatterns.behavioral.chainofresponsibility.ErrorLogger;
import com.example.designpatterns.behavioral.chainofresponsibility.Logger;
import com.example.designpatterns.behavioral.chainofresponsibility.WarningLogger;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Logger logger = getLoggingChain();

        logger.logMessage(Logger.WARNING_INFO, "This is a warning");
        logger.logMessage(Logger.ERROR_INFO, "This is an error");
        logger.logMessage(Logger.DEBUG_INFO, "This is a debug");
    }

    private static Logger getLoggingChain() {
        Logger warnLogger = new WarningLogger(Logger.WARNING_INFO);
        Logger errorLogger = new ErrorLogger(Logger.ERROR_INFO);
        warnLogger.setNextLoggerInChain(errorLogger);
        Logger debugLogger = new DebugLogger(Logger.DEBUG_INFO);
        errorLogger.setNextLoggerInChain(debugLogger);
        return warnLogger;
    }
}
