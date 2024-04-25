package com.learning._22springauth.services;

import com.learning._22springauth.dtos.CreateUserDto;
import com.learning._22springauth.entities.UserEntity;
import com.learning._22springauth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<UserEntity> findAll() {
        try {
            return this.userRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public UserEntity findByEmail(String email) {
        try {
            return this.userRepository.findByEmail(email).orElseThrow();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
