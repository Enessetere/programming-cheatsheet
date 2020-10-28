package com.example.designpatterns.behavioral.template;

class Tetris extends Game {
    @Override
    public void menu() {
        System.out.println("Display Tetris menu.");
    }

    @Override
    public void process() {
        System.out.println("Process Tetris game");
    }
}
