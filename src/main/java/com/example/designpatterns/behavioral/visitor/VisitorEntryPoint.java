package com.example.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorEntryPoint {
    private final Visitor visitor = new VisitorImpl();
    private final List<Industry> industries = new ArrayList<>();

    public void createIndustries(String... companies) {
        for (String company : companies) {
            switch (company) {
                case "bank" : industries.add(new Bank()); break;
                case "cafe" : industries.add(new Cafe()); break;
                case "construction" : industries.add(new Construction()); break;
                default : break;
            }
        }
    }

    public void visitAll(){
        for (Industry industry : industries) {
            industry.accept(visitor);
        }
    }
}
