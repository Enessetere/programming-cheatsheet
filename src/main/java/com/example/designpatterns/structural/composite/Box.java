package com.example.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Merchandise {
    private final List<Merchandise> merchandises;
    private final Double price;

    public Box(Double price) {
        merchandises = new ArrayList<>();
        this.price = price;
    }

    @Override
    public double getValue() {
        return price + getLeavesValue();
    }

    private Double getLeavesValue() {
        return merchandises.stream()
                .mapToDouble(Merchandise::getValue)
                .sum();
    }
    public void add(Merchandise merchandise) {
        merchandises.add(merchandise);
    }

    public void remove(Merchandise merchandise) {
        merchandises.remove(merchandise);
    }

    @Override
    public String toString() {
        return "Box{" +
                "merchandises=" + merchandises +
                ", price=" + price +
                '}';
    }
}
