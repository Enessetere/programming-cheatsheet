package com.example.designpatterns.structural.flyweight;

public class ChangeableCommonObject {
    private String name;
    private Long age;
    private String address;
    private FlyweightCommonObject flyweightCommonObject;

    ChangeableCommonObject(String name, Long age, String address, FlyweightCommonObject flyweightCommonObject) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.flyweightCommonObject = flyweightCommonObject;
    }

    String getName() {
        return name;
    }

    Long getAge() {
        return age;
    }

    String getAddress() {
        return address;
    }

    FlyweightCommonObject getFlyweightCommonObject() {
        return flyweightCommonObject;
    }

    public void insideToString() {
        System.out.println(flyweightCommonObject);
    }
}
