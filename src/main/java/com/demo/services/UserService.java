package com.demo.services;

import com.demo.entities.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService
{
    List<UserEntity> findAll();
    Optional<UserEntity> findById(Integer id);
    UserEntity save(UserEntity user);
    UserEntity update(UserEntity user);
    void deleteById(UserEntity user);
}
