package com.example.designpatterns.behavioral.mediator;

public class Helicopter extends Participant {

    public Helicopter(String id, TrafficHandler trafficHandler) {
        this.identification = id;
        priority = Priority.LOW;
        timeToLandInSeconds = 10L;
        this.trafficHandler = trafficHandler;
        isWaiting = true;
        System.out.println(id + " is waiting");
    }
}
