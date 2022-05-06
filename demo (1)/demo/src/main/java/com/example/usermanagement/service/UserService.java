package com.example.usermanagement.service;

import com.example.usermanagement.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAllUser();
    Optional<User> findUserById(int id);
    User addUser(User user);
    User update(User user);
    void deleteUseer(int id);
}
