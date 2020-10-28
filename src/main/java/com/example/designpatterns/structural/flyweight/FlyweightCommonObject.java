package com.example.designpatterns.structural.flyweight;

class FlyweightCommonObject {
    private String city;
    private String state;
    private String country;

    FlyweightCommonObject(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
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
