package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.template.Game;

public class TemplateDemo {
    public static void main(String[] args) {
        Game pong = new Game.GameBuilder().setType("pong").build();
        Game tetris = new Game.GameBuilder().setType("tetris").build();

        System.out.println("Pong game:");
        pong.initialize();
        pong.menu();
        pong.process();
        pong.close();

        System.out.println("\nTetris game:");
        tetris.initialize();
        tetris.menu();
        tetris.process();
        tetris.close();
    }
}
