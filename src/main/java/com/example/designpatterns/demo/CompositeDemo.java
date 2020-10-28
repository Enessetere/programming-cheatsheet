package com.example.designpatterns.demo;

import com.example.designpatterns.structural.composite.Box;
import com.example.designpatterns.structural.composite.Good;

public class CompositeDemo {
    public static void main(String[] args) {
        Box box = new Box(1.0);
        box.add(new Good("hammer", 13.2));
        box.add(new Good("screwdriver", 12.9));
        Box biggerBox = new Box(2.0);
        biggerBox.add(new Good("nails", 9.9));
        biggerBox.add(new Good("wire", 23.5));
        biggerBox.add(box);
        System.out.println(biggerBox);
        System.out.println(biggerBox.getValue());
    }
}
