package com.example.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

class RedoMemento {
    private final List<Memento> states = new ArrayList<>();

    void saveMemento(Memento state) {
        states.add(state);
    }

    Memento redo() {
        return states.remove(states.size() - 1);
    }
}
