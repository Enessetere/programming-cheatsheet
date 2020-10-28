package com.example.designpatterns.behavioral.command;

public abstract class ActionListenerCommand {
    protected File file;
    protected abstract void execute();
}
