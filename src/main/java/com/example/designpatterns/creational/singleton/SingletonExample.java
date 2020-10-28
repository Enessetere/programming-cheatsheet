package com.example.designpatterns.creational.singleton;

public class SingletonExample {
    private static SingletonExample singletonExample = null;

    public static SingletonExample getInstance() {
        if (singletonExample == null)
            synchronized (SingletonExample.class) {
                if (singletonExample == null)
                    singletonExample = new SingletonExample();
            }
        return singletonExample;
    }

    private SingletonExample() {
    }
}
