package com.example.designpatterns.behavioral.observer;

class User implements Subscriber, Runnable {
    private final String username;
    private boolean isAlive;

    User(String username) {
        this.username = username;
        isAlive = true;
        System.out.println(username + " has been created.");
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void kill() {
        isAlive = false;
    }

    @Override
    public void update() {
        System.out.println(username + "!\n\tWe have great news for you.\nOur brand new product is now available\nin our shops. Hope to see you soon.\n\nBest regards,\nAmmo-nation");
    }

    @Override
    public void subscribe() {
        Company.subscribe(this);
        System.out.println(username + "!\nYou have been added to our subscription list.");
    }

    @Override
    public void unsubscribe() {
        Company.unsubscribe(this);
        System.out.println(username + "!\nYou have been removed from our subscription list.");
    }

    @Override
    public synchronized boolean isAlive() {
        return isAlive;
    }

    @Override
    public void run() {
        while (isAlive()) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println(username + "!\nDS: YOU DIED!");
    }
}
