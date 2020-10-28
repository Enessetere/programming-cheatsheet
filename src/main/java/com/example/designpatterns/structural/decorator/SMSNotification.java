package com.example.designpatterns.structural.decorator;

public class SMSNotification implements Notification {

    private final Notification notification;

    public SMSNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification() {
        notification.sendNotification();
        System.out.println("Send SMS notification.");
    }
}
