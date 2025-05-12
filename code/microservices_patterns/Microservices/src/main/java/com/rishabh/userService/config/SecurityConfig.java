//package com.rishabh.userService.config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@EnableWebFluxSecurity
//public class SecurityConfig {
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//        return http
//                .authorizeExchange(exchanges -> exchanges
//                        .pathMatchers("/users/**").authenticated()
//                        .anyExchange().permitAll()
//                )
//                .httpBasic(httpBasicSpec -> {}) // Updated to use lambda-based configuration
//                .csrf(ServerHttpSecurity.CsrfSpec::disable)
//                .build();
//    }
//
//    @Bean
//    public MapReactiveUserDetailsService userDetailsService() {
//        UserDetails user = User.withUsername("admin")
//                .password("{noop}password") // Using NoOpPasswordEncoder for simplicity
//                .roles("USER")
//                .build();
//        return new MapReactiveUserDetailsService(user);
//    }
//}
//
