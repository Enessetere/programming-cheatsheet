package com.example.designpatterns.architectural.eventbus;

public class EventSubscriber implements Subscriber {
    @Override
    public void handle(Event<?> event) {
        System.out.println("EventSubscriber handle everything. Acquired data: " + event.getData());
    }
}
