package com.geekster.UserManagement.controller;

import com.geekster.UserManagement.model.User;
import com.geekster.UserManagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {
 
    @Autowired
    private UserService userService;

    @GetMapping("getUser/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("getAllUsers")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @PostMapping("addUser")
    public String addUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("updateUserInfo/{userId}")
    public String updateUserInfo(@PathVariable int userId, @Valid @RequestBody User user) {
        user.setUserId(userId);
        return userService.updateUserInfo(user);
    }

    @DeleteMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return userService.deleteUser(userId);
    }
}
