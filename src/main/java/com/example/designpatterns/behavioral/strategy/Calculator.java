package com.example.designpatterns.behavioral.strategy;

public class Calculator {
    public double calculate(double value1, double value2, char operator) {
        return switch (operator) {
            case '+' -> addition(value1, value2);
            case '-' -> subtraction(value1,value2);
            case '*' -> multiplication(value1, value2);
            case '/' -> division(value1, value2);
            default -> throw new IllegalArgumentException("unknown operation");
        };
    }

    private double addition(double a, double b) {
        return new Addition().calculate(a, b);
    }

    private double subtraction(double a, double b) {
        return new Subtraction().calculate(a, b);
    }

    private double multiplication(double a, double b) {
        return new Multiplication().calculate(a, b);
    }

    private double division(double a, double b) {
        return new Division().calculate(a, b);
    }
}
