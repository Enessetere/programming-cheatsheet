package com.example.designpatterns.creational.objectpool;

public class CustomObjectPool extends ObjectPool<LongCreatedObject> {
    @Override
    protected LongCreatedObject createObject() {
        return new LongCreatedObject();
    }
}
