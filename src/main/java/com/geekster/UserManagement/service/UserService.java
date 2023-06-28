package com.geekster.UserManagement.service;

import com.geekster.UserManagement.model.User;
import com.geekster.UserManagement.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getUsers() {
        return userRepo.getUsers();
    }

    public User getUserById(int userId) {
        for (User user : userRepo.getUsers()) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        throw new RuntimeException("User not found"); // Throw exception when user is not found
    }

    public String addUser(@Validated User user) {
        userRepo.getUsers().add(user);
        return "New user added";
    }

    public String updateUserInfo(@Validated User user) {
        List<User> userList = userRepo.getUsers();
        for (int i = 0; i < userList.size(); i++) {
            User existingUser = userList.get(i);
            if (existingUser.getUserId() == user.getUserId()) {
                userList.set(i, user);
                return "User updated successfully";
            }
        }
        return "User Not Found";
    }

    public String deleteUser(int userId) {
        List<User> userList = userRepo.getUsers();
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getUserId() == userId) {
                userList.remove(i);
                return "User Deleted";
            }
        }
        return "User Not Found";
    }
}
