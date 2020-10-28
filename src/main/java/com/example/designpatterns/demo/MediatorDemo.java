package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.mediator.*;

public class MediatorDemo {
    public static void main(String[] args) {
        TrafficHandler trafficHandler = new AirTrafficMediator();

        Helicopter h351 = new Helicopter("H351", trafficHandler);
        Boeing b381 = new Boeing("B381", trafficHandler);
        Helicopter h551 = new Helicopter("H551", trafficHandler);
        F22 f8742 = new F22("F8742", trafficHandler);
        LightAircraft la725 = new LightAircraft("LA725", trafficHandler);

        new Thread(h351).start();
        new Thread(b381).start();
        new Thread(h551).start();
        new Thread(f8742).start();
        new Thread(la725).start();

        trafficHandler.addToSchedule(h351, h551, b381, f8742, la725);
        trafficHandler.changePriority(h551, Priority.CRITICAL);
        trafficHandler.changePriority(b381, Priority.LOW);
        trafficHandler.process();
    }
}
