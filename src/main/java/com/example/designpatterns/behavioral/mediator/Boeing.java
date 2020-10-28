package com.example.designpatterns.behavioral.mediator;

public class Boeing extends Participant {
    public Boeing(String id, TrafficHandler trafficHandler) {
        this.identification = id;
        this.trafficHandler = trafficHandler;
        timeToLandInSeconds = 30L;
        isWaiting = true;
        priority = Priority.HIGH;
        System.out.println(id + " is waiting");
    }
}
