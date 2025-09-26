package com.example.securitydemo.controller;

//package com.example.securitydemo.controller;

import com.example.securitydemo.util.JwtUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class AuthController {

    private final AuthenticationManager authManager;

    public AuthController(AuthenticationManager authManager) {
        this.authManager = authManager;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> body) {
        try {
            String username = body.get("username");
            String password = body.get("password");

            authManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

            String token = JwtUtil.generateToken(username);
            return Map.of("token", token);

        } catch (AuthenticationException e) {
            return Map.of("error", "Invalid credentials");
        }
    }
}
