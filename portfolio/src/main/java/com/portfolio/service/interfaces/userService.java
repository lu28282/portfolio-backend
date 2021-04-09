package com.portfolio.service.interfaces;

import com.portfolio.model.User;

public interface userService {
    
    public Iterable<User> getAllUsers();

    public User getUser(long userId);

    public void removeUser(long userId);

    public void save(User user);
}
