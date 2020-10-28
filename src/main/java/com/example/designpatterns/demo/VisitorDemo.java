package com.example.designpatterns.demo;

import com.example.designpatterns.behavioral.visitor.VisitorEntryPoint;

public class VisitorDemo {
    public static void main(String[] args) {
        VisitorEntryPoint visitorEntryPoint = new VisitorEntryPoint();

        visitorEntryPoint.createIndustries("bank", "construction", "cafe", "cafe", "bank", "cafe", "construction", "cafe", "bank");
        visitorEntryPoint.visitAll();
    }
}
