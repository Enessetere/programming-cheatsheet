package com.example.designpatterns.creational.prototype;

public class PersonDetails implements PersonPrototype {

    int id;
    String firstName;
    String lastName;

    public PersonDetails(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String showData() {
        return id + ": " + firstName + " " + lastName;

    }

    @Override
    public PersonPrototype getClone() {
        return new PersonDetails(0, this.firstName, this.lastName);
    }
}
