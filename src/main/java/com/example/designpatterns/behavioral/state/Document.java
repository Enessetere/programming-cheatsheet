package com.example.designpatterns.behavioral.state;

class Document {
    private State state;
    private String content;

    Document() {
        state = new Draft(this);
    }

    void setContent(String text) {
        this.content = text;
    }

    String getContent() {
        return state + ":" + content;
    }

    void changeState(State state) {
        this.state = state;
    }

    void publish(boolean isAdmin) {
        state.publish(isAdmin);
    }

    void render() {
        state.render();
    }
}
