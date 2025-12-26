package com.example.demo.security;

public class JwtTokenProvider {

    public JwtTokenProvider(String secret, int expiry){}
    public JwtTokenProvider(){}

    public String generateToken(Long id, String email, String role){
        return id + "|" + email + "|" + role;
    }

    public String getEmailFromToken(String t){ return t.split("\\|")[1]; }
    public String getRoleFromToken(String t){ return t.split("\\|")[2]; }
    public Long getUserIdFromToken(String t){ return Long.parseLong(t.split("\\|")[0]); }
}
