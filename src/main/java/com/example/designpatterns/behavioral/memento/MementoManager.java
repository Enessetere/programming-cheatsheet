package com.example.designpatterns.behavioral.memento;

public class MementoManager {
    private final Document document;
    private final UndoMemento undoMemento;
    private final RedoMemento redoMemento;

    public MementoManager() {
        document = new Document();
        undoMemento = new UndoMemento();
        redoMemento = new RedoMemento();
    }

    public void write(String text) {
        undoMemento.saveMemento(document.write(text));
    }

    public void undo() {
        Memento undo = undoMemento.undo();
        redoMemento.saveMemento(new Memento(document.getText()));
        document.setText(undo.getState());
    }

    public void redo() {
        undoMemento.saveMemento(new Memento(document.getText()));
        document.setText(redoMemento.redo().getState());
    }

    public void display() {
        System.out.println(document.getText());
    }
}
