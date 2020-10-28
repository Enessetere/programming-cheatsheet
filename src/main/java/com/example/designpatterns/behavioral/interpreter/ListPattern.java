package com.example.designpatterns.behavioral.interpreter;

import java.util.Arrays;
import java.util.List;

public class ListPattern implements Pattern<List<String>> {
    @Override
    public List<String> conversion(String exp) {
        return Arrays.asList(exp.split("&"));
    }
}
