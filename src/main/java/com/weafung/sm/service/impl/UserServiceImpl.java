package com.weafung.sm.service.impl;

import com.weafung.sm.entity.User;
import com.weafung.sm.mapper.UserMapper;
import com.weafung.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        System.out.println(userMapper);
        return userMapper.findById(id);
    }

    @Override
    public void saveUser(User user) {
        userMapper.save(user);
    }

    @Override
    public void removeUser(Long id) {
        userMapper.delete(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.update(user);
    }
}
