package com.example.designpatterns.behavioral.mediator;

public abstract class Participant implements Runnable {
    protected boolean isWaiting;
    protected String identification;
    protected Priority priority;
    protected long timeToLandInSeconds;
    protected TrafficHandler trafficHandler;

    Priority getPriority() {
        return priority;
    }

    void changePriority(Priority priority) {
        this.priority = priority;
    }

    void receiveMessage(String message) {
        System.out.println("Participant " + identification + " received message: " + message);
    }

    void takeDown() {
        try {
            Thread.sleep(timeToLandInSeconds * 1000);
            isWaiting = false;
            trafficHandler.removeFromSchedule();
        } catch (InterruptedException exception) {
            throw new RuntimeException("Something went wrong during landing");
        }
    }

    @Override
    public void run() {
        while (isWaiting) {
            try {
                Thread.sleep(1000L);
                if (priority == Priority.PENDING) {
                    takeDown();
                }
            } catch (InterruptedException exception) {
                throw new RuntimeException("Something went wrong");
            }
        }
    }

    @Override
    public String toString() {
        return identification;
    }
}
