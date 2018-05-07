package com.weafung.sm.service;

import com.weafung.sm.entity.User;

public interface UserService {
    User getUser(Long id);
    void saveUser(User user);
    void removeUser(Long id);
    void updateUser(User user);
}
