package com.example.designpatterns.creational.abstractfactory.vehicle;

class CreateSedan implements Vehicle {
    @Override
    public Character getType() {
        return 'S';
    }
}
