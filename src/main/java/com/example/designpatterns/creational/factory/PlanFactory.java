package com.example.designpatterns.creational.factory;

public class PlanFactory {

    public BillingPlan create(String planType) {
        return switch (planType) {
            case "Commercial" -> new CommercialPlan();
            case "Domestic" -> new DomesticPlan();
            case "Institutional" -> new InstitutionalPlan();
            default -> null;
        };
    }
}
