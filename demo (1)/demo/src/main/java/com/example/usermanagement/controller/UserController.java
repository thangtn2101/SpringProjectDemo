package com.example.usermanagement.controller;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable("id") int id){
        return userService.findUserById(id);
    }
    @PostMapping
    public User addUser(@RequestBody @Valid User user){
        return userService.addUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUseer(id);
    }

}
