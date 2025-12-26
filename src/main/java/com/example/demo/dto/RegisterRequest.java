package com.example.demo.dto;

public class RegisterRequest {

    private String email;
    private String password;
    private String role;

    public RegisterRequest() {}

    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getRole() { return role; }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final RegisterRequest r = new RegisterRequest();

        public Builder email(String e) { r.email = e; return this; }
        public Builder password(String p) { r.password = p; return this; }
        public Builder role(String role) { r.role = role; return this; }

        public RegisterRequest build() { return r; }
    }
}
