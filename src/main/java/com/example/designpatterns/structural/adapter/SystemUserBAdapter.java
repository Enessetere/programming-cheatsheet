package com.example.designpatterns.structural.adapter;

import java.util.List;

public class SystemUserBAdapter implements User {

    private SystemUserB systemUserB;

    public SystemUserBAdapter(SystemUserB systemUserB) {
        this.systemUserB = systemUserB;
    }

    @Override
    public String getName() {
        return systemUserB.getFullName();
    }

    @Override
    public String getDisplayName() {
        return systemUserB.getUsername();
    }

    @Override
    public Integer getAge() {
        return systemUserB.getAge();
    }

    @Override
    public List<String> getRoles() {
        return systemUserB.getRoles();
    }

    @Override
    public String toString() {
        return "SystemUserBAdapter{" +
                "systemUserB=" + systemUserB +
                '}';
    }
}
