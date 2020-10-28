package com.example.designpatterns.structural.facade;

class UserService {

    private final UserInMemoryRepository userInMemoryRepository;
    private static UserService userService = null;

    static synchronized UserService getInstance() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    private UserService() {
        userInMemoryRepository = UserInMemoryRepository.getInstance();
    }

    boolean create(String username, String password) {
        User user = userInMemoryRepository.save(username, password, "USER");
        return user == null;
    }

    boolean attemptToLogIn(String username, String password) {
        User user = userInMemoryRepository.getByUsername(username);
        return user != null && passwordMatch(user, password);
    }

    private boolean passwordMatch(User user, String password) {
        return user.getPassword().equals(password);
    }
}
