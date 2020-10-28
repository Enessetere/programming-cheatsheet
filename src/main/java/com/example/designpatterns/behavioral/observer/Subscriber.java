package com.example.designpatterns.behavioral.observer;

interface Subscriber {
    void update();
    void subscribe();
    void unsubscribe();
    void kill();
    boolean isAlive();
    String getUsername();
}
