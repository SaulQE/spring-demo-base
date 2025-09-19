package com.demo.controllers;

import com.demo.entities.UserEntity;
import com.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody UserEntity user){
        return ResponseEntity.ok(userService.save(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody UserEntity newUser, @PathVariable Integer id){
        Optional<UserEntity> optionalUser = userService.findById(id);
        if (optionalUser.isPresent()){
            newUser.setUserId(id);
            return ResponseEntity.ok(userService.update(newUser));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        Optional<UserEntity> optionalUser = userService.findById(id);
        if (optionalUser.isPresent()){
            userService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
