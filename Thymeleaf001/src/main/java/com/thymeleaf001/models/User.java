package com.thymeleaf001.models;

/**
 * Created by hiemseyha on 7/28/17.
 */
public class User {

    private String username;

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
