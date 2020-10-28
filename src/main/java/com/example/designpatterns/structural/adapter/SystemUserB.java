package com.example.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SystemUserB {
    private String fullName;
    private String username;
    private Integer age;
    private List<String> roles;

    @Override
    public String toString() {
        return "SystemUserB{" +
                "fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", roles=" + roles +
                '}';
    }
}
