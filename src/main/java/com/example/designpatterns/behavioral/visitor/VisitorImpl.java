package com.example.designpatterns.behavioral.visitor;

class VisitorImpl implements Visitor {
    @Override
    public void visitBank(Bank bank) {
        System.out.println("Visiting bank: " + bank);
    }

    @Override
    public void visitCafe(Cafe cafe) {
        System.out.println("Visiting cafe: " + cafe);
    }

    @Override
    public void visitConstruction(Construction construction) {
        System.out.println("Visiting construction: " + construction);
    }
}
