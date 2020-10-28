package com.example.designpatterns.behavioral.command;

public class Menu {
    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;
    private ActionListenerCommand closeCommand;

    public Menu(ActionListenerCommand openCommand, ActionListenerCommand saveCommand, ActionListenerCommand closeCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
        this.closeCommand = closeCommand;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }

    public void clickClose() {
        closeCommand.execute();
    }
}
