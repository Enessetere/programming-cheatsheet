package com.example.designpatterns.behavioral.strategy;

class Division implements CalculationStrategy {
    @Override
    public double calculate(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return a / b;
    }
}
