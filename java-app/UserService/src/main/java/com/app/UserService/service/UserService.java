package com.app.UserService.service;

import com.app.UserService.model.User;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;


@Service
public class UserService {

    private final List<User> users = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    // CREATE
    public User createUser(User user) {
        user.setId(counter.getAndIncrement());
        users.add(user);
        return user;
    }

    // READ ALL
    public List<User> getAllUsers() {
        return users;
    }

    // READ ONE
    public Optional<User> getUserById(Long id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst();
    }

    // UPDATE
    public Optional<User> updateUser(Long id, User updatedUser) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                u.setName(updatedUser.getName());
                u.setEmail(updatedUser.getEmail());
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }

    // DELETE
    public boolean deleteUser(Long id) {
        return users.removeIf(u -> u.getId().equals(id));
    }
}