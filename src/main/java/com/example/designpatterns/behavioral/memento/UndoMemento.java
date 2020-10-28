package com.example.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

class UndoMemento {
    private final List<Memento> states = new ArrayList<>();

    void saveMemento(Memento state) {
        states.add(state);
    }

    Memento undo() {
        return states.remove(states.size() - 1);
    }
}
