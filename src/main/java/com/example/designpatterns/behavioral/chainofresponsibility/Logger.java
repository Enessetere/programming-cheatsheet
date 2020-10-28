package com.example.designpatterns.behavioral.chainofresponsibility;

public abstract class Logger {
    public static final int WARNING_INFO = 1;
    public static final int ERROR_INFO = 2;
    public static final int DEBUG_INFO = 3;

    protected int level;
    protected Logger nextLoggerInChain;

    public void setNextLoggerInChain(Logger nextLoggerInChain) {
        this.nextLoggerInChain = nextLoggerInChain;
    }

    public void logMessage(int level, String message) {
        if (this.level >= level) {
            displayLogInfo(message);
        }
        nextInChain(level, message);
    }

    protected void nextInChain(int level, String message) {
        if (nextLoggerInChain != null) {
            nextLoggerInChain.logMessage(level, message);
        }
    }

    protected abstract void displayLogInfo(String message);
}
