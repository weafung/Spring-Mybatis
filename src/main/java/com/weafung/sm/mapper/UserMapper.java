package com.weafung.sm.mapper;

import com.weafung.sm.entity.User;

public interface UserMapper {
    User findById(Long id);
    void save(User user);
    void update(User user);
    void delete(Long id);
}
