package com.example.designpatterns.structural.proxy;

class GrantInternetAccess implements InternetAccess {

    @Override
    public void grantInternetAccess(Employee employee) {
        System.out.println("Internet granted for user " + employee.getUsername());
    }
}
