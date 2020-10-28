package com.example.designpatterns.creational.abstractfactory.vehicle;

class CreateHarley implements Vehicle {
    @Override
    public Character getType() {
        return 'H';
    }
}
