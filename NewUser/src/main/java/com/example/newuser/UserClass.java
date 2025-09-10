package com.example.newuser;

import org.apache.catalina.User;

public class UserClass {
    private String username;
    private String email;
    private int age;

    public UserClass(String username, String email, int age){
            this.username = username;
            this.email = email;
            this.age = age;
        }
        public String getUserName() {
        return username;
        }
        public void setUsername(String username) {}

        public String getEmail() {
        return email;
    }
        public void setEmail(String email) {}

        public int getAge() {
        return age;
    }
        public void setAge(int age) {}
}

