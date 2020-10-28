package com.example.designpatterns.structural.bridge;

public class QuizFormat extends QuizBridge {

    public void displayAll() {
        System.out.println("------------------------------------------------------");
        super.displayAll();
        System.out.println("------------------------------------------------------");
    }
}
