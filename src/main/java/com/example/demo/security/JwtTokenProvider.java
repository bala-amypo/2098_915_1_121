package com.example.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component   // ⭐ THIS IS THE KEY FIX
public class JwtTokenProvider {

    private Key key;
    private long validityInMs;

    // ✅ REQUIRED for Spring + tests
    public JwtTokenProvider() {
        this.key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        this.validityInMs = 3600000; // 1 hour
    }

    // ✅ REQUIRED for test cases
    public JwtTokenProvider(String secret, int validityInSeconds) {
        this.key = Keys.hmacShaKeyFor(secret.getBytes());
        this.validityInMs = validityInSeconds * 1000L;
    }

    // ✅ REQUIRED by tests
    public String generateToken(long userId, String email, String role) {
        Date now = new Date();
        Date expiry = new Date(now.getTime() + validityInMs);

        return Jwts.builder()
                .setSubject(email)
                .claim("userId", userId)
                .claim("role", role)
                .setIssuedAt(now)
                .setExpiration(expiry)
                .signWith(key)
                .compact();
    }

    // ✅ REQUIRED by filters
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // ✅ REQUIRED by filter
    public String getUsernameFromToken(String token) {
        return getClaims(token).getSubject();
    }

    // ✅ REQUIRED by tests
    public String getEmailFromToken(String token) {
        return getClaims(token).getSubject();
    }

    // ✅ REQUIRED by tests
    public String getRoleFromToken(String token) {
        return getClaims(token).get("role", String.class);
    }

    // ✅ REQUIRED by tests
    public Long getUserIdFromToken(String token) {
        return getClaims(token).get("userId", Long.class);
    }

    private Claims getClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
