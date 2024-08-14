package com.example.judi.services.Impl;

import com.example.judi.entity.User;
import com.example.judi.enums.SexeEnum;
import com.example.judi.model.UserDto;
import com.example.judi.repository.UserRepository;
import com.example.judi.services.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserDto userDto) {
        if (userRepository.findByEmail(userDto.getEmail())) {
            throw new RuntimeException("L'email existe deja");
        }
        User user = new User(userDto.getNom(), userDto.getAge(), userDto.getSexe(), userDto.getEmail());
        return userRepository.save(user);
    }

    @Override
    public List<User> findByNom(String nom) {

        return userRepository.findByNom(nom);

    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();

    }

    @Override
    public List<User> getAllMinorGirls() {
        return userRepository.findBySexe(SexeEnum.feminin)
                .stream()
                .filter(u -> u.getAge() < 18)
                .collect(Collectors.toList());
    }

    @Override
    public List<User> getAllBoys() {
        return userRepository.findAll().stream().filter(u -> {
            return u.getSexe().equals(SexeEnum.masculin);
        }).collect(Collectors.toList());
    }

}
