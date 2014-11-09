package com.tony.springtest.service;

import com.tony.springtest.entity.User;

public interface UserService {

    void saveUser(User user);
    

    User findUserById(Integer id);
    

    void updateUser(User user);

    void deleteUserById(Integer id);
}
