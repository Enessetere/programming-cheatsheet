package com.example.designpatterns.architectural.eventbus_guava;

public class Event {
    private String action;

    public Event(String action) {
        this.action = action;
    }

    String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
