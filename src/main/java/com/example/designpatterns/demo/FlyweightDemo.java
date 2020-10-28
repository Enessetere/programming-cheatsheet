package com.example.designpatterns.demo;

import com.example.designpatterns.structural.flyweight.BoldObjects;
import com.example.designpatterns.structural.flyweight.ChangeableCommonObject;
import com.example.designpatterns.structural.flyweight.CommonObject;
import com.example.designpatterns.structural.flyweight.FlyweightObject;

import java.util.List;

public class FlyweightDemo {
    public static void main(String[] args) {
        Integer generation = 10;
        BoldObjects boldObjects = new BoldObjects();
        List<CommonObject> commonObjects = boldObjects.generate(generation);
        FlyweightObject flyweightObject = new FlyweightObject();
        List<ChangeableCommonObject> flyweightObjects = flyweightObject.generate(generation);
        commonObjects.forEach(System.out::println);
        flyweightObjects.forEach(System.out::println);
        flyweightObjects.forEach(ChangeableCommonObject::insideToString);
    }
}
