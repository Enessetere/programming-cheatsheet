package com.example.designpatterns.creational.objectpool;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<TYPE> {
    private final Set<TYPE> available = new HashSet<>();
    private final Set<TYPE> inUse = new HashSet<>();

    protected abstract  TYPE createObject();

    public synchronized  TYPE checkout() {
        if (available.isEmpty()) {
            available.add(createObject());
        }
        TYPE instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        return instance;
    }

    public synchronized void checkIn(TYPE instance) {
        inUse.remove(instance);
        available.add(instance);
    }

    public synchronized String toString() {
        return "Pool available = " + available.size() + "; in use = " + inUse.size();
    }
}
