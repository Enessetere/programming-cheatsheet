package com.example.designpatterns.demo;

import com.example.designpatterns.creational.builder.BuilderExample;

public class BuilderDemo {
    public static void main(String[] args) {
        BuilderExample example = new BuilderExample.Builder().firstName("John").lastName("Smith").build();
        System.out.println(example);
    }
}
