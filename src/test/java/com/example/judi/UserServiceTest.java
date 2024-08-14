/*package com.example.judi;

import com.example.judi.entity.User;
import com.example.judi.repository.UserRepository;
import com.example.judi.services.Impl.UserServiceImpl;
import com.example.judi.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;




public class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @Mock
    UserService userService;

    AutoCloseable autoCloseable;

    @Test
    void testCreateuserWithSuccess(){
        User user = new User(20, "my name");

        when(userRepository.save(any(User.class))).thenReturn(user);

        User userResult = userService.createUser(user);

        assertEquals(user.getName(), userResult.getName());
        assertEquals(user.getAge(), userResult.getAge());
        verify(userRepository, times(2)).save(user);
    }

    @BeforeEach
    void setup(){
        autoCloseable = MockitoAnnotations.openMocks(this);
        userService = new UserServiceImpl(userRepository);
    }




}*/
