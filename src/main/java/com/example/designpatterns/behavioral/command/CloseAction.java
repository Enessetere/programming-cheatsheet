package com.example.designpatterns.behavioral.command;

public class CloseAction extends ActionListenerCommand {

    public CloseAction(File file) {
        this.file = file;
    }

    @Override
    protected void execute() {
        file.close();
    }
}

