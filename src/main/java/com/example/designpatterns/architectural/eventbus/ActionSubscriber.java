package com.example.designpatterns.architectural.eventbus;

public class ActionSubscriber implements Subscriber {
    @Override
    public void handle(Event<?> event) {
        System.out.println("ActionSubscriber handled event. Acquired data: " + event.getData());
    }
}
