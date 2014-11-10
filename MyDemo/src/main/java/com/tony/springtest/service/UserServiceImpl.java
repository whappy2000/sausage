package com.tony.springtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tony.springtest.entity.User;
import com.tony.springtest.repositories.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
        
    }

    public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
    @Transactional(readOnly=true)
    public User findUserById(Integer id) {
        return userRepository.findOne(id);
    }

    
    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUserById(Integer id) {
        userRepository.delete(id);
    }

	@Override
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByName(name);
	}

}
