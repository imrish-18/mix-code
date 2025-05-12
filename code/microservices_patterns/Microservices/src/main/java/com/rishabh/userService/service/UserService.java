//package com.rishabh.userService.service;
//
//
//import com.rishabh.userService.Model.User;
//import com.rishabh.userService.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import reactor.core.publisher.Mono;
//
//@Service
//public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public Mono<User> registerUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword())); // Encrypt password
//        return userRepository.save(user);
//    }
//
//    public Mono<User> findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//}
//
