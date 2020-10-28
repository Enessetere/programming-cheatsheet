package com.example.designpatterns.demo;

import com.example.designpatterns.creational.factory.BillingPlan;
import com.example.designpatterns.creational.factory.PlanFactory;

public class FactoryDemo {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();

        BillingPlan plan = planFactory.create("Domestic");
        System.out.println(plan.calculateBill(100L));
    }
}
