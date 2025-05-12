//package com.rishabh.userService.security;
//
//
//import io.jsonwebtoken.*;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.stereotype.Component;
//
//import javax.crypto.SecretKey;
//import java.util.Date;
//import java.util.function.Function;
//
//@Component
//public class JwtUtil {
//    private final SecretKey SECRET_KEY = Jwts.SIG.HS256.key().build();
//
//    public String generateToken(String username) {
//        return Jwts.builder()
//                .subject(username)
//                .issuedAt(new Date())
//                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1-hour expiration
//                .signWith(SECRET_KEY, Jwts.SIG.HS256) // Updated signing method
//                .compact();
//    }
//
//    public String extractUsername(String token) {
//        return Jwts.parser() // Changed back to `parser()`
//                .verifyWith(SECRET_KEY) // Required verification
//                .build()
//                .parseSignedClaims(token)
//                .getPayload()
//                .getSubject();
//    }
//
//    public Date extractExpiration(String token) {
//        return extractClaim(token, Claims::getExpiration);
//    }
//
//    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//        Claims claims = Jwts.parser()
//                .verifyWith(SECRET_KEY)
//                .build()
//                .parseSignedClaims(token)
//                .getPayload();
//        return claimsResolver.apply(claims);
//    }
//
//    public boolean validateToken(String token) {
//        try {
//            Jwts.parser().verifyWith(SECRET_KEY).build().parseSignedClaims(token);
//            return true;
//        } catch (JwtException e) {
//            return false;
//        }
//    }
//
//    private boolean isTokenExpired(String token) {
//        return extractExpiration(token).before(new Date());
//    }
//}
//
