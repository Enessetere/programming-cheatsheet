package com.example.designpatterns.behavioral.mediator;

public class F22 extends Participant {
    public F22(String id, TrafficHandler trafficHandler) {
        this.identification = id;
        this.trafficHandler = trafficHandler;
        timeToLandInSeconds = 25;
        priority = Priority.VERY_HIGH;
        isWaiting = true;
        System.out.println(id + " is waiting");
    }
}
