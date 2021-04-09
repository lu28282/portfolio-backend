package com.portfolio.service.impl;

import com.portfolio.dao.UserRepository;
import com.portfolio.model.User;
import com.portfolio.service.interfaces.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(long userId) {
        return userRepository.findUserById(userId);
    }

    @Override
    public void removeUser(long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
    
}
