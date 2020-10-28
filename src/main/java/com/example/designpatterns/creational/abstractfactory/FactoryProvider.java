package com.example.designpatterns.creational.abstractfactory;

import com.example.designpatterns.creational.abstractfactory.vehicle.CarFactory;
import com.example.designpatterns.creational.abstractfactory.vehicle.MotorFactory;
import com.example.designpatterns.creational.abstractfactory.vehicle.Vehicle;
import com.example.designpatterns.creational.abstractfactory.vehicle.VehicleType;

public class FactoryProvider {
    public AbstractVehicleFactory<Vehicle> create(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new CarFactory();
            case MOTOR -> new MotorFactory();
            default -> null;
        };
    }
}
