package com.example.designpatterns.architectural.eventbus;

import java.util.Set;

public interface EventBus {
    void register(Subscriber subscriber);
    void dispatch(Event<?> event);
    void unregister(Subscriber subscriber);
    Set<Subscriber> getSubscribers();
}
