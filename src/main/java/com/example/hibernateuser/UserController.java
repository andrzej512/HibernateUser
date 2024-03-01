package com.example.hibernateuser;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/v1/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("/v1/users")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
