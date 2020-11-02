package com.example.designpatterns.demo;

import com.example.designpatterns.architectural.eventbus_guava.Event;
import com.example.designpatterns.architectural.eventbus_guava.EventListener;
import com.google.common.eventbus.EventBus;

public class GuavaEventBusDemo {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        EventListener eventListener = new EventListener();

        eventBus.register(eventListener);
        eventBus.post("StringEvent");
        eventBus.post(new Event("Object event"));
        eventBus.post(13);
    }
}
