package com.example.designpatterns.behavioral.visitor;

class Cafe implements Industry {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCafe(this);
    }
}
