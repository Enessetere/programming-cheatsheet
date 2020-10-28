package com.example.designpatterns.behavioral.mediator;

public class LightAircraft extends Participant {
    public LightAircraft(String id, TrafficHandler trafficHandler) {
        this.identification = id;
        this.trafficHandler = trafficHandler;
        timeToLandInSeconds = 20L;
        priority = Priority.MEDIUM;
        isWaiting = true;
        System.out.println(id + " is waiting");
    }
}
