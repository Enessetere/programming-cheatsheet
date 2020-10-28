package com.example.designpatterns.structural.proxy;

public class EmployeeService {
    private Employee employee;
    private final InternetAccess internetAccess;

    public EmployeeService() {
        internetAccess = new ProxyGrantInternetAccess();
    }

    public void createEmployee(String username, int role) {
        employee = new Employee(username, role);
    }

    public void getInternetAccess() {
        internetAccess.grantInternetAccess(employee);
    }
}
