package com.example.designpatterns.structural.proxy;

class ProxyGrantInternetAccess implements InternetAccess{
    protected GrantInternetAccess grantInternetAccess;

    ProxyGrantInternetAccess() {
        grantInternetAccess = new GrantInternetAccess();
    }

    @Override
    public void grantInternetAccess(Employee employee) {
        if (employee.getUserRole() > 3) {
            grantInternetAccess.grantInternetAccess(employee);
        } else {
            System.out.println("Employee level is too low.");
        }
    }
}
