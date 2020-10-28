package com.example.designpatterns.demo;

import com.example.designpatterns.structural.adapter.*;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        SystemUserA systemUserA = new SystemUserA("Jane", "Doe", 31L, List.of("ADMIN"));
        SystemUserB systemUserB = new SystemUserB("John Wick", "Baba Yaga", 43, List.of("BOOGEYMAN"));

        List<User> users = new ArrayList<>();
        users.add(new SystemUserAAdapter(systemUserA));
        users.add(new SystemUserBAdapter(systemUserB));

        users.forEach(System.out::println);
    }
}
