package com.example.judi.services;

import com.example.judi.entity.User;
import com.example.judi.model.UserDto;
import java.util.List;


public interface UserService {
    public  User createUser(UserDto userDto);
    public List<User> getAll();
    public List<User> getAllMinorGirls();
    public List<User> getAllBoys();
    public List<User> findByNom(String nom);


}
