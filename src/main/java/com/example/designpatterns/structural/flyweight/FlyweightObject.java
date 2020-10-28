package com.example.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightObject {
    private final FlyweightFactory flyweightFactory;

    public FlyweightObject() {
        this.flyweightFactory = new FlyweightFactory();
    }

    public List<ChangeableCommonObject> generate(Integer nGenerate) {
        List<ChangeableCommonObject> result = new ArrayList<>();
        for (int i = 0; i < nGenerate; i++) {
            result.add(new ChangeableCommonObject(
                    i + "name",
                    (long)i,
                    i + "address",
                    flyweightFactory.create("city", "state", "country")));
        }
        return result;
    }
}
