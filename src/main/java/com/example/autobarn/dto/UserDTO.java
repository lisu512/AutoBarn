package com.example.autobarn.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class UserDTO {
    // Getters and Setters
    private String username;
    private String email;
    private String password;
    private Instant registeredAt;

}
