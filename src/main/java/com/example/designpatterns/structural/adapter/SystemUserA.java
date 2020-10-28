package com.example.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SystemUserA {
    private String firstName;
    private String lastName;
    private long age;
    private List<String> roles;

    @Override
    public String toString() {
        return "SystemUserA{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", roles=" + roles +
                '}';
    }
}
