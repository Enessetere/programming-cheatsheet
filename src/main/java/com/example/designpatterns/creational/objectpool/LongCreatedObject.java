package com.example.designpatterns.creational.objectpool;

import java.util.concurrent.atomic.AtomicInteger;

public class LongCreatedObject {
    private static final AtomicInteger COUNTER = new AtomicInteger(0);
    private final int id;

    public LongCreatedObject() {
        id = COUNTER.getAndIncrement();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException exception) {
            throw new RuntimeException("Something went wrong");
        }
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Object id=" + id;
    }
}
