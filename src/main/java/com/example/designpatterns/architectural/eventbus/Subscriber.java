package com.example.designpatterns.architectural.eventbus;

public interface Subscriber {
    void handle(Event<?> event);
}
