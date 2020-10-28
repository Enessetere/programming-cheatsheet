package com.example.designpatterns.demo;

import com.example.designpatterns.creational.abstractfactory.FactoryProvider;
import com.example.designpatterns.creational.abstractfactory.vehicle.Vehicle;
import com.example.designpatterns.creational.abstractfactory.vehicle.VehicleType;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        final FactoryProvider factoryProvider = new FactoryProvider();

        Vehicle veh = factoryProvider.create(VehicleType.CAR).create("Sedan");
        System.out.println(veh.getType());
        veh = factoryProvider.create(VehicleType.MOTOR).create("Cross");
        System.out.println(veh.getType());
    }
}
