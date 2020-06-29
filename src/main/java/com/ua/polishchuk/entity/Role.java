package com.ua.polishchuk.entity;

import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;

public enum Role implements GrantedAuthority {
    ROLE_USER,
    ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }

    public static boolean contains(String role){
        return Arrays.stream(Role.values())
               .anyMatch(role1 -> role1.toString().equals(role));
    }
}
