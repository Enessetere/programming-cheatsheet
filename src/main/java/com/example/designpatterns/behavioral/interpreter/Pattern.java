package com.example.designpatterns.behavioral.interpreter;

public interface Pattern<TYPE> {
    TYPE conversion(String exp);
}
