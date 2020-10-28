package com.example.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class BoldObjects {

    public List<CommonObject> generate(Integer nGenerate) {
        List<CommonObject> result = new ArrayList<>();
        for (int i = 0; i < nGenerate; i++) {
            result.add(new CommonObject(i + "name", (long)i, i + "address", "city", "state", "country"));
        }
        return result;
    }

}
