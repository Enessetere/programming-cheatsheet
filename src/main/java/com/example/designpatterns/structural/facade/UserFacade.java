package com.example.designpatterns.structural.facade;

public class UserFacade {
    private final UserService userService;

    public UserFacade() {
        this.userService = UserService.getInstance();
    }

    public String createUser(String username, String password) {
        boolean result = userService.create(username, password);
        return (result) ? "User " + username + " has been created." : "Cannot create user " + username + "!";
    }

    public String logIn(String username, String password) {
        boolean result = userService.attemptToLogIn(username, password);
        return (result) ? "User " + username + " log in success." : "Cannot log in.";
    }
}
