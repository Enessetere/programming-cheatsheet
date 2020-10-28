package com.example.designpatterns.structural.facade;

final class User {
    private final String username;
    private final String password;
    private final String role;

    User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    String getUsername() {
        return username;
    }

    String getPassword() {
        return password;
    }

    String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return username;
    }
}
