package com.example.designpatterns.creational.abstractfactory.vehicle;

import com.example.designpatterns.creational.abstractfactory.AbstractVehicleFactory;

public class MotorFactory implements AbstractVehicleFactory<Vehicle> {
    @Override
    public Vehicle create(String type) {
        return switch (type) {
            case "Harley" -> new CreateHarley();
            case "Cross" -> new CreateCross();
            default -> null;
        };
    }
}
