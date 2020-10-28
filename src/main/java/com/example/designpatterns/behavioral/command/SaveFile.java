package com.example.designpatterns.behavioral.command;

public class SaveFile extends ActionListenerCommand {
    public SaveFile(File file) {
        this.file = file;
    }

    @Override
    protected void execute() {
        file.save();
    }
}
