package com.geekster.UserManagement.repository;

import com.geekster.UserManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Component
@Validated
public class UserRepo {

    @Autowired
    private List<User> userList;

    public List<User> getUsers() {
        return userList;
    }
}
