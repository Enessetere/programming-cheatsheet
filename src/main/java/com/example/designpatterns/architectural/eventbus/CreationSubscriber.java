package com.example.designpatterns.architectural.eventbus;

public class CreationSubscriber implements Subscriber {
    @Override
    public void handle(Event<?> event) {
        System.out.println("CreationSubscriber handled event. Acquired data: " + event.getData());
    }
}
