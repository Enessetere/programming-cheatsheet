package com.example.designpatterns.behavioral.interpreter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MapPattern implements Pattern<Map<String, String>> {
    @Override
    public Map<String, String> conversion(String exp) {
        return Arrays.stream(exp.split("&"))
                .map(pair -> pair.split("="))
                .collect(Collectors.toMap(
                        (pair) -> pair[0],
                        (pair) -> pair[1]
                ));
    }
}
