package com.example.designpatterns.demo;

import com.example.designpatterns.creational.prototype.PersonDetails;

public class PrototypeDemo {
    public static void main(String[] args) {
        PersonDetails person = new PersonDetails(1, "Jane", "Doe");
        System.out.println(person.showData());
        PersonDetails clone = (PersonDetails) person.getClone();
        System.out.println(clone.showData());
    }
}
