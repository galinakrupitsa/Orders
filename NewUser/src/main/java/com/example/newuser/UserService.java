package com.example.newuser;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String myMethod(String userName, String email) {
        return "Hello " + userName + " " + email;
    }
}
