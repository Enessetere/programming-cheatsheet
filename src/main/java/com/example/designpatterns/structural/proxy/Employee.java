package com.example.designpatterns.structural.proxy;

class Employee {
    private String username;
    private int userRole;

    Employee(String username, int role) {
        this.username = username;
        this.userRole = role;
    }

    String getUsername() {
        return username;
    }

    int getUserRole() {
        return userRole;
    }
}
