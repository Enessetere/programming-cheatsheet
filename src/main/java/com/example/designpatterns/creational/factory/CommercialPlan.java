package com.example.designpatterns.creational.factory;

class CommercialPlan implements BillingPlan {

    @Override
    public double calculateBill(long units) {
        return units * 5.34;
    }

}
