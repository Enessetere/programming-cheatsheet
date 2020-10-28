package com.example.designpatterns.behavioral.visitor;

class Bank implements Industry {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }
}
