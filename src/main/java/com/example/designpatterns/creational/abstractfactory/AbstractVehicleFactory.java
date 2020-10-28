package com.example.designpatterns.creational.abstractfactory;

public interface AbstractVehicleFactory<VEHICLE> {
    VEHICLE create(String type);
}
