package com.geekster.UserManagement.configuration;

import com.geekster.UserManagement.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
@Validated
public class BeanManager {

    @Bean
    public List<User> getInitializedList() {
        User initUser = new User(1, "Ayaan", "2000-02-16", "ayaanansari097@gmail.com", "919024835040", "27-06-2023", "05:36");
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
