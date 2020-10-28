package com.example.designpatterns.behavioral.template;

public abstract class Game {
    private String name;

    public void initialize() {
        System.out.println("Run game libraries");
    }

    public abstract void menu();
    public abstract void process();

    public void close() {
        System.out.println("Closing game...");
    }

    public static class GameBuilder {
        private String type;

        public GameBuilder() {
        }

        public GameBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Game build() {
            return switch (type) {
                case "pong" -> new Pong();
                case "tetris" -> new Tetris();
                default -> null;
            };
        }
    }
}
