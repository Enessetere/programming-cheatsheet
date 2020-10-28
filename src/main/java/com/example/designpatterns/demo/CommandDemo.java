package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.command.*;

public class CommandDemo {
    public static void main(String[] args) {
        File file = new File();

        ActionListenerCommand open = new OpenAction(file);
        ActionListenerCommand save = new SaveFile(file);
        ActionListenerCommand close = new CloseAction(file);

        Menu menu = new Menu(open, save, close);

        menu.clickOpen();
        menu.clickSave();
        menu.clickClose();
    }
}
