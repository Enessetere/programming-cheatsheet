package com.example.designpatterns.behavioral.template;

class Pong extends Game {
    @Override
    public void menu() {
        System.out.println("Display Pong menu");
    }

    @Override
    public void process() {
        System.out.println("Process Pong game");
    }
}
