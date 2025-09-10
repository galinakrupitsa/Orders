package com.example.newuser;

import org.apache.catalina.User;

public class UserClass {
    private String userName;
    private String email;
    private int age;

    public UserClass(String userName, String email, int age){
            this.userName = userName;
            this.email = email;
            this.age = age;
        }
        public String getUserName() {
        return userName;
        }
        public void setUserName(String userName) {}

        public String getEmail() {
        return email;
    }
        public void setEmail(String email) {}

        public int getAge() {
        return age;
    }
        public void setAge(int age) {}
}

