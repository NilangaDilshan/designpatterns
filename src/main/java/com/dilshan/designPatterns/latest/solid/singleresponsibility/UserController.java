package com.dilshan.designPatterns.latest.solid.singleresponsibility;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class UserController {

    private final UserPersistenceService userPersistenceService;

    private final UserValidator userValidator;

    public UserController() {
        this.userPersistenceService = new UserPersistenceService();
        this.userValidator = new UserValidator();
    }

    public static void main(String[] args) throws IOException {
        UserController userController = new UserController();
        String validUserJson = "{\"name\":\"Dilshan\",\"email\":\"slayer@gmail.com\",\"password\":\"123\"}";
        String invalidUserJson = "{\"name\":\"\",\"email\":\" \",\"password\":\"\"}";
        userController.createUser(validUserJson);
        userController.createUser(invalidUserJson);
    }

    public String createUser(String userJson) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(userJson, User.class);
        boolean valid = this.userValidator.validUser(user);
        if (valid) {
            log.info("User created successfully, User: {}", user.getName());
            this.userPersistenceService.saveUser(user);
            return "SUCCESS";
        } else {
            log.error("User creation failed, User: {}", user.getName());
            return "ERROR";
        }
    }

    //Validates the user
    public static class UserValidator {
        public boolean validUser(User user) {
            if (user.getName() == null || user.getName().isEmpty()) {
                return false;
            }
            user.setName(user.getName().trim());
            if (user.getEmail() == null || user.getEmail().isEmpty()) {
                return false;
            }
            user.setEmail(user.getEmail().trim());
            if (user.getPassword() == null || user.getPassword().isEmpty()) {
                return false;
            }
            user.setPassword(user.getPassword().trim());
            return true;
        }
    }

    public static class UserPersistenceService {

        private final Storage storage = new Storage();

        public void saveUser(User user) {
            this.storage.storeUser(user);
        }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class User {
        private String name;
        private String email;
        private String password;
    }


    public static class Storage {
        //This is thread safe way of storing users
        //Here no need to use synchronized block
        //ConcurrentHashMap is thread safe
        private static final Map<String, User> users = new ConcurrentHashMap<>();

        public void storeUser(User user) {
            users.put(user.getName(), user);
        }

        public User getUser(String name) {
            return users.get(name);
        }
    }
}
