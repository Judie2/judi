package com.example.judi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.judi.entity.User;
import com.example.judi.model.UserDto;
import com.example.judi.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User create(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);

    }

    @GetMapping("/searchNom{nom}")
    public List<User> findByNom(@pathVariable("nom") String nom) {
        return userService.findByNom(nom);
    }

    @GetMapping("/searchAge{age}")
    public List<User> findByAge(@pathVariable("age") Integer age) {
        return ((UserController) userService).findByAge(age);
    }

    @GetMapping("/list")
    public List<User> getAll() {
        return userService.getAll();
    }

}
