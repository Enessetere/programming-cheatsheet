package com.example.designpatterns.behavioral.memento;

class Document {
    private String state = "";

    Memento write(String text) {
        Memento memento = new Memento(state);
        state += text;
        return memento;
    }

    String getText() {
        return state;
    }

    void setText(String text) {
        state = text;
    }
}
