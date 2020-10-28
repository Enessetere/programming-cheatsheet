package com.example.designpatterns.structural.composite;

public class Good implements Merchandise{
    private String name;
    private Double price;

    public Good(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getValue() {
        return price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
