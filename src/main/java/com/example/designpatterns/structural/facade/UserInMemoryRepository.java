package com.example.designpatterns.structural.facade;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class UserInMemoryRepository {
    private static UserInMemoryRepository userInMemoryRepository;
    private Map<String, User> userMap;

    static synchronized UserInMemoryRepository getInstance() {
        if (userInMemoryRepository == null) {
            userInMemoryRepository = new UserInMemoryRepository();
        }
        return userInMemoryRepository;
    }

    private UserInMemoryRepository() {
        this.userMap = new ConcurrentHashMap<>();
    }

    User save(String username, String password, String role) {
        User user = new User(username, password, role);
        return userMap.put(username, user);
    }

    User getByUsername(String username) {
        return userMap.get(username);
    }
}
