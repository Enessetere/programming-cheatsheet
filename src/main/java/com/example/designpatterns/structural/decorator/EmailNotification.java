package com.example.designpatterns.structural.decorator;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Send email notification.");
    }
}
