package com.example.designpatterns.demo;

import com.example.designpatterns.structural.proxy.EmployeeService;

public class ProxyDemo {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.createEmployee("user",1);
        employeeService.getInternetAccess();
        employeeService.createEmployee("Admin",6);
        employeeService.getInternetAccess();
    }
}
