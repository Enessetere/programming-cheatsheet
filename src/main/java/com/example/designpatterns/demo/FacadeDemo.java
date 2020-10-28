package com.example.designpatterns.demo;

import com.example.designpatterns.structural.facade.UserFacade;

public class FacadeDemo {
    public static void main(String[] args) {
        UserFacade userFacade = new UserFacade();

        System.out.println(userFacade.createUser("user", "password"));
        System.out.println(userFacade.logIn("user", "password"));
    }
}
