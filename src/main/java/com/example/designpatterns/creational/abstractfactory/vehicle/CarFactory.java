package com.example.designpatterns.creational.abstractfactory.vehicle;

import com.example.designpatterns.creational.abstractfactory.AbstractVehicleFactory;

public class CarFactory implements AbstractVehicleFactory<Vehicle> {
    @Override
    public Vehicle create(String type) {
        return switch (type) {
            case "Truck" -> new CreateTruck();
            case "Sedan" -> new CreateSedan();
            default -> null;
        };
    }
}
