package com.example.designpatterns.behavioral.command;

public class File {
    public void open() {
        System.out.println("File has been opened");
    }

    public void save() {
        System.out.println("File has been saved");
    }

    public void close() {
        System.out.println("File has been closed");
    }
}
