package com.example.designpatterns.demo;

import com.example.designpatterns.creational.singleton.SingletonExample;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        System.out.println(singletonExample1);
        System.out.println(singletonExample2);
    }
}
