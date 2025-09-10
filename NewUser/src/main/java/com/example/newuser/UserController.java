package com.example.newuser;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

public final UserService userService;
public UserController(UserService userService) {
    this.userService = userService;
}
@PostMapping("/users/{userId}")
    public String addUser(@RequestParam String role,
                          @RequestBody UserClass userClass) {
    return "Роль " + role  + "\n" + "Имя " + userClass.getUserName() + "\n" + "почта " + userClass.getEmail()
            + "\n" + "Возрат " + userClass.getAge();
}

}
