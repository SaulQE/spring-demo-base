package com.demo.services;

import com.demo.entities.UserEntity;
import com.demo.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<UserEntity> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<UserEntity> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public UserEntity save(UserEntity user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public UserEntity update(UserEntity user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}