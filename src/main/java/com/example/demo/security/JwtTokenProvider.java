package com.example.demo.security;

public class JwtTokenProvider {

    public JwtTokenProvider() {}

    public JwtTokenProvider(String secret, int expiry) {}

    public boolean validateToken(String token) {
        return token != null && token.contains("|");
    }

    public String getUsernameFromToken(String token) {
        return token.split("\\|")[1];
    }

    public String generateToken(Long id, String email, String role) {
        return id + "|" + email + "|" + role;
    }

    public String getEmailFromToken(String token) {
        return token.split("\\|")[1];
    }

    public String getRoleFromToken(String token) {
        return token.split("\\|")[2];
    }

    public Long getUserIdFromToken(String token) {
        return Long.parseLong(token.split("\\|")[0]);
    }
}
