package com.example.designpatterns.behavioral.state;

class Published implements State {
    private final Document doc;

    Published(Document doc) {
        this.doc = doc;
    }

    @Override
    public void render() {
        doc.changeState(new Draft(doc));
    }

    @Override
    public void publish(boolean isAdmin) {
    }

    @Override
    public String toString() {
        return "PUBLISHED";
    }
}
