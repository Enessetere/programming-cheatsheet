package com.example.designpatterns.behavioral.command;

public class OpenAction extends ActionListenerCommand {
    public OpenAction(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.open();
    }
}
