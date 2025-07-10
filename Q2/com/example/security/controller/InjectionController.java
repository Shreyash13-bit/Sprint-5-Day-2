package com.example.security.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class InjectionController {

    // SQL Injection example (not safe - demonstration only)
    @GetMapping("/sql")
    public String vulnerableSql(@RequestParam String username) {
        return "SELECT * FROM users WHERE username = '" + username + "';";
    }

    // XSS example (not safe - demonstration only)
    @GetMapping("/xss")
    public String xssDemo(@RequestParam String input) {
        return "<html><body>Welcome " + input + "</body></html>";
    }
}