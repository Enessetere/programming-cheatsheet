package com.example.designpatterns.behavioral.state;

interface State {
    void render();
    void publish(boolean isAdmin);
}
