package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.memento.MementoManager;

public class MementoDemo {
    public static void main(String[] args) {
        MementoManager mementoManager = new MementoManager();
        mementoManager.write("jane");
        mementoManager.write(" doe");
        mementoManager.write(" always wanted");
        mementoManager.write(" to dance");
        mementoManager.display();
        mementoManager.undo();
        mementoManager.undo();
        mementoManager.display();
        mementoManager.redo();
        mementoManager.display();
        mementoManager.write(" to kill zombies.");
        mementoManager.display();
    }
}
