package com.example.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class FlyweightFactory {
    private final List<FlyweightCommonObject> objects = new ArrayList<>();

    public FlyweightCommonObject create(String city, String state, String country) {
        Optional<FlyweightCommonObject> objectFound = objects.stream()
                .filter(obj -> isCreated(obj, city, state, country))
                .findFirst();
        if (objectFound.isPresent()) {
            return  objectFound.get();
        }
        objects.add(new FlyweightCommonObject(city, state, country));
        return objects.get(objects.size()-1);
    }

    private boolean isCreated(FlyweightCommonObject flyweightCommonObject, String city, String state, String country) {
        return flyweightCommonObject.getCity().equals(city)
                && flyweightCommonObject.getState().equals(state)
                && flyweightCommonObject.getCountry().equals(country);
    }
}
