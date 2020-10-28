package com.example.designpatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

class Company {
    private static final Set<Subscriber> SUBSCRIBERS = new HashSet<>();

    static void subscribe(Subscriber subscriber) {
        SUBSCRIBERS.add(subscriber);
    }

    static void unsubscribe(Subscriber subscriber) {
        SUBSCRIBERS.remove(subscriber);
    }

    void addNewMerchandise(String merchandise) {
        System.out.println("Company added new merchandise: " + merchandise);
        notifySubscribers();

    }

    void notifySubscribers() {
        for (Subscriber subscriber : SUBSCRIBERS) {
            subscriber.update();
        }
    }
}
