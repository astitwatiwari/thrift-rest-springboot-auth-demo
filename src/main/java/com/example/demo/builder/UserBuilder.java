package com.example.demo.builder;

import com.example.demo.TUser;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserBuilder {
    public static User buildUser(TUser user) {
        return new User(user.getUserId(), user.getUsername(), user.getPassword());
    }

    public static TUser buildTUser(User user) {
        return new TUser(user.getUserId(), user.getUsername(), user.getPassword());
    }
}
