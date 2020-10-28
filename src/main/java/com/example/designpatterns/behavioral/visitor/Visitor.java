package com.example.designpatterns.behavioral.visitor;

interface Visitor {
    void visitBank(Bank bank);
    void visitCafe(Cafe cafe);
    void visitConstruction(Construction construction);
}
