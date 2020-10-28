package com.example.designpatterns.creational.factory;

class DomesticPlan implements BillingPlan {
    @Override
    public double calculateBill(long units) {
        return units * 3.12;
    }
}
