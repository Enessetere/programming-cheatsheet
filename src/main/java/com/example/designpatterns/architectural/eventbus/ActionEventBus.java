package com.example.designpatterns.architectural.eventbus;

import java.util.HashSet;
import java.util.Set;

public class ActionEventBus implements EventBus {
    private final Set<Subscriber> subscribers = new HashSet<>();

    @Override
    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void dispatch(Event<?> event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.handle(event);
        }
    }

    @Override
    public void unregister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public Set<Subscriber> getSubscribers() {
        return subscribers;
    }
}
