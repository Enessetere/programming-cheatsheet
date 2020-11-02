package com.example.designpatterns.architectural.eventbus;

public class CreationEvent implements Event<Integer> {
    private final Integer statusCode;

    public CreationEvent(Integer statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public Integer getData() {
        return statusCode;
    }
}
