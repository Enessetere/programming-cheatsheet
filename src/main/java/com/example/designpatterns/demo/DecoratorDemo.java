package com.example.designpatterns.demo;

import com.example.designpatterns.structural.decorator.EmailNotification;
import com.example.designpatterns.structural.decorator.FBNotification;
import com.example.designpatterns.structural.decorator.Notification;
import com.example.designpatterns.structural.decorator.SMSNotification;

public class DecoratorDemo {
    public static void main(String[] args) {
        Notification notification = new SMSNotification(new FBNotification(new EmailNotification()));

        notification.sendNotification();
    }
}
