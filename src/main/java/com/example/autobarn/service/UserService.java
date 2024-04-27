package com.example.autobarn.service;

import com.example.autobarn.dto.UserDTO;
import com.example.autobarn.entity.User;
import com.example.autobarn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO registerUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setRegisteredAt(Instant.now());
        User savedUser = userRepository.save(user);
        return convertToDTO(savedUser);
    }

    public String loginUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) { // 密码比较应改为加密后的比较
            return "token"; // 实际应生成一个真实的token
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }

    private UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setRegisteredAt(Instant.now());
        return dto;
    }
}
