package com.example.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class SubscriptionFacade {
    private static SubscriptionFacade facade = null;
    private Company company;
    private List<Subscriber> subscribers;

    private SubscriptionFacade() {
        company = new Company();
        subscribers = new ArrayList<>();
    }

    public synchronized static SubscriptionFacade getInstance() {
        if (facade == null) {
            facade = new SubscriptionFacade();
        }
        return facade;
    }

    public void createUser(String username) {
        User subscriber = new User(username);
        subscribers.add(subscriber);
        new Thread(subscriber).start();
    }

    public void subscribe(String username) {
        Subscriber subscriber = findByUsername(username);
        if (nonNull(subscriber) && subscriber.isAlive()) {
            subscriber.subscribe();
        }
    }

    private Subscriber findByUsername(String username) {
        return subscribers.stream()
                .filter(sub -> isUsernameEqual(sub, username))
                .findFirst()
                .orElse(null);
    }

    private boolean isUsernameEqual(Subscriber subscriber, String username) {
        return subscriber.getUsername().equals(username);
    }

    public void unsubscribe(String username) {
        Subscriber subscriber = findByUsername(username);
        if (nonNull(subscriber) && subscriber.isAlive()) {
            subscriber.unsubscribe();
        }
    }

    public void cleanUp() {
        for (Subscriber subscriber : subscribers) {
            if (subscriber.isAlive()) {
                subscriber.kill();
            }
        }
        subscribers.clear();
    }

    public void addNewProduct(String productName) {
        company.addNewMerchandise(productName);
    }
}
