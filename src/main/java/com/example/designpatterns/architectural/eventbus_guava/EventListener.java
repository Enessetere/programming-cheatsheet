package com.example.designpatterns.architectural.eventbus_guava;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

public class EventListener {

    @Subscribe
    public void event(String event) {
        System.out.println(event + " handled String");
    }

    @Subscribe
    public void myEvent(Event event) {
        System.out.println(event.getAction() + " handled Object");
    }

    @Subscribe
    public void handleDeadEvent(DeadEvent event) {
        System.out.println(event.getEvent() + " unhandled");
    }
}
