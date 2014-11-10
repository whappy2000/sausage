package com.tony.springtest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tony.springtest.entity.User;


@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
    
    public List<User> findByName(String name);
}