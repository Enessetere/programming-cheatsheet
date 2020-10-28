package com.example.designpatterns.creational.factory;

class InstitutionalPlan implements BillingPlan {
    @Override
    public double calculateBill(long units) {
        return units * 4.23;
    }
}
