package com.rishabh.userService.controller;


import com.rishabh.userService.Model.User;
import com.rishabh.userService.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private  UserRepository userRepository;

    @GetMapping
    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public Mono<User> createUser(@RequestBody @Valid User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteUser(@PathVariable String id) {
        return userRepository.deleteById(id);
    }

}

