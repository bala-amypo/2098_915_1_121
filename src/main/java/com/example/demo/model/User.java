package com.example.demo.model;

public class User {
    private long id;
    private String email;
    private String password;
    private String role;
    private String name;

    public User() {}

    public static User builder() {
        return new User();
    }

    public User id(long id) {
        this.id = id;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User role(String role) {
        this.role = role;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User build() {
        return this;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
