package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.strategy.Calculator;

public class StrategyDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double a = 25.0;
        double b = 5.0;

        System.out.println(calculator.calculate(a, b, '+'));
        System.out.println(calculator.calculate(a, b, '-'));
        System.out.println(calculator.calculate(a, b, '*'));
        System.out.println(calculator.calculate(a, b, '/'));
    }
}
