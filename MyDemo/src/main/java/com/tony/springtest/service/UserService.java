package com.tony.springtest.service;

import java.util.List;

import com.tony.springtest.entity.User;

public interface UserService {

    void saveUser(User user);
    

    User findUserById(Integer id);
    
    List<User> findByName(String name);

    void updateUser(User user);

    void deleteUserById(Integer id);
}
