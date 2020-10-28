package com.example.designpatterns.behavioral.state;

class Draft implements State {
    private final Document doc;

    Draft(Document doc) {
        this.doc = doc;
    }

    @Override
    public void render() {
    }

    @Override
    public void publish(boolean isAdmin) {
        if (!isAdmin) {
            doc.changeState(new Revision(doc));
        } else {
            doc.changeState(new Published(doc));
        }
    }

    @Override
    public String toString() {
        return "DRAFT";
    }
}
