package com.example.designpatterns.creational.abstractfactory.vehicle;

class CreateTruck implements Vehicle {

    @Override
    public Character getType() {
        return 'T';
    }
}
