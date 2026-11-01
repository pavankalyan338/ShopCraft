package com.example.shopcraft.service;

import com.example.shopcraft.model.User;
import com.example.shopcraft.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Map<String, Object> registerUser(User user) {
        Map<String, Object> response = new HashMap<>();
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            response.put("success", false);
            response.put("message", "Email already exists");
            return response;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("USER");
        }
        userRepository.save(user);
        response.put("success", true);
        response.put("message", "User registered successfully");
        return response;
    }

    public Map<String, Object> loginUser(String email, String rawPassword) {
        Map<String, Object> response = new HashMap<>();
        Optional<User> userOpt = userRepository.findByEmail(email);

        if (userOpt.isPresent() && passwordEncoder.matches(rawPassword, userOpt.get().getPassword())) {
            User user = userOpt.get();
            response.put("success", true);
            response.put("token", "dummy-jwt-session-token-" + user.getId());
            response.put("userId", user.getId());
            response.put("name", user.getFullName());
            response.put("role", user.getRole());
            return response;
        }

        response.put("success", false);
        response.put("message", "Invalid email or password");
        return response;
    }
}