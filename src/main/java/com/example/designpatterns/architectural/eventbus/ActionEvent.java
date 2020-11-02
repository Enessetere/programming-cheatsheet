package com.example.designpatterns.architectural.eventbus;

public class ActionEvent implements Event<String> {
    private String actionEvent;

    public ActionEvent(String actionEvent) {
        this.actionEvent = actionEvent;
    }

    @Override
    public String getData() {
        return actionEvent;
    }
}
