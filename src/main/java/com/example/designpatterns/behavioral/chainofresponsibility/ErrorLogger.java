package com.example.designpatterns.behavioral.chainofresponsibility;

public class ErrorLogger extends Logger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void displayLogInfo(String message) {
        System.out.println("ERROR: " + message);
    }
}
