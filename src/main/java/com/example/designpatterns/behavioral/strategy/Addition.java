package com.example.designpatterns.behavioral.strategy;

class Addition implements CalculationStrategy {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
