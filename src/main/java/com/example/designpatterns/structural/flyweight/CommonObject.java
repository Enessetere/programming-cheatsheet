package com.example.designpatterns.structural.flyweight;

public class CommonObject {
    private String name;
    private Long age;
    private String address;
    private String city;
    private String state;
    private String country;

    CommonObject(String name, Long age, String address, String city, String state, String country) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
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

    String getCity() {
        return city;
    }

    String getState() {
        return state;
    }

    String getCountry() {
        return country;
    }
}
