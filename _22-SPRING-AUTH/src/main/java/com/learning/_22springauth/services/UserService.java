package com.learning._22springauth.services;

import com.learning._22springauth.dtos.CreateUserDto;
import com.learning._22springauth.entities.UserEntity;
import com.learning._22springauth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity save(CreateUserDto data) {
        UserEntity user = new UserEntity();

        user.setEmail(data.email);
        user.setName(data.name);
        user.setUsername(data.username);
        user.setPassword(data.password);

        return this.userRepository.save(user);
    }
}
