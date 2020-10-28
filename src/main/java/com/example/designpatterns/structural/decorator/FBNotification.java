package com.example.designpatterns.structural.decorator;

public class FBNotification implements Notification {
    private final Notification notification;

    public FBNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification() {
        System.out.println("Send FB notification.");
        notification.sendNotification();

    }
}
