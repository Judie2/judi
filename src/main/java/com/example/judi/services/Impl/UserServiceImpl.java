package com.example.judi.services.Impl;

import com.example.judi.entity.User;
import com.example.judi.repository.UserRepository;
import com.example.judi.services.UserService;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        userRepository.save(user);
        return userRepository.save(user);
    }

}
