package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.observer.SubscriptionFacade;

import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        SubscriptionFacade subscription = SubscriptionFacade.getInstance();
        List<String> users = List.of("user1", "user2", "user3", "user4");

        for (String user : users) {
            subscription.createUser(user);
        }

        for (int idx = 0; idx < users.size(); idx++) {
            if (idx % 2 == 0) {
                subscription.subscribe(users.get(idx));
            }
        }

        subscription.addNewProduct("M14");

        subscription.unsubscribe(users.get(2));

        subscription.addNewProduct("AK-47");

        subscription.cleanUp();
    }
}
