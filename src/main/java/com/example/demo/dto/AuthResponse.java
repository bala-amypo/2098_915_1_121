package com.example.demo.dto;

public class AuthResponse {

    private String token;
    private String type;

    public AuthResponse() {}

    public AuthResponse(String token) {     // ✅ THIS FIXES ERROR
        this.token = token;
        this.type = "Bearer";
    }

    public AuthResponse(String token, String type) {
        this.token = token;
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public String getType() {
        return type;
    }
}
