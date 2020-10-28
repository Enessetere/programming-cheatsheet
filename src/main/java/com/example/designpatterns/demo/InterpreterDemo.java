package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.interpreter.ListPattern;
import com.example.designpatterns.behavioral.interpreter.MapPattern;
import com.example.designpatterns.behavioral.interpreter.Pattern;

import java.util.List;
import java.util.Map;

public class InterpreterDemo {
    public static void main(String[] args) {
        Pattern<Map<String, String>> mapPattern = new MapPattern();
        Pattern<List<String>> listPattern = new ListPattern();
        String example = "arg1=val1&arg2=val2&arg3=val3";

        System.out.println("Map Pattern:");
        mapPattern.conversion(example).forEach((k,v) -> System.out.println(k + ":" + v));
        System.out.println("List Pattern:");
        listPattern.conversion(example).forEach(System.out::println);
    }
}
