package com.example.designpatterns.behavioral.chainofresponsibility;

public class WarningLogger extends Logger {
    public WarningLogger(int level) {
        this.level = level;
    }

    @Override
    protected void displayLogInfo(String message) {
        System.out.println("WARN: " + message);
    }
}
