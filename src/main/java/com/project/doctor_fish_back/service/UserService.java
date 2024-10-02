package com.project.doctor_fish_back.service;

import com.project.doctor_fish_back.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Boolean isDuplicateEmail(String email) {
        return Optional.ofNullable(userMapper.findByEmail(email)).isPresent();
    }
}
