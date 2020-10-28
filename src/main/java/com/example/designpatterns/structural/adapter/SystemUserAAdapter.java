package com.example.designpatterns.structural.adapter;

import java.util.List;

public class SystemUserAAdapter implements User {

    private SystemUserA systemUserA;

    public SystemUserAAdapter(SystemUserA systemUserA) {
        this.systemUserA = systemUserA;
    }

    @Override
    public String getName() {
        return systemUserA.getFirstName() + " " + systemUserA.getLastName();
    }

    @Override
    public String getDisplayName() {
        return systemUserA.getLastName();
    }

    @Override
    public Integer getAge() {
        return (int)systemUserA.getAge();
    }

    @Override
    public List<String> getRoles() {
        return systemUserA.getRoles();
    }

    @Override
    public String toString() {
        return "SystemUserAAdapter{" +
                "systemUserA=" + systemUserA +
                '}';
    }
}
