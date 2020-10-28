package com.example.designpatterns.behavioral.visitor;

class Construction implements Industry {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConstruction(this);
    }
}
