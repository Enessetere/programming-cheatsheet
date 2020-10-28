package com.example.designpatterns.behavioral.state;

class Revision implements State {
    private final Document doc;

    Revision(Document doc) {
        this.doc = doc;
    }

    @Override
    public void render() {
        doc.changeState(new Draft(doc));
    }

    @Override
    public void publish(boolean isAdmin) {
        if(isAdmin) {
            doc.changeState(new Published(doc));
        }
    }

    @Override
    public String toString() {
        return "REVISION";
    }
}
