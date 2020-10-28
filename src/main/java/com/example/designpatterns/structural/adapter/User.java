package com.example.designpatterns.structural.adapter;

import java.util.List;

public interface User {
    String getName();
    String getDisplayName();
    Integer getAge();
    List<String> getRoles();
}
