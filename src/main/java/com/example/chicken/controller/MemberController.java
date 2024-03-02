package com.example.chicken.controller;

import com.example.chicken.config.service.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/login")
    public String login() {
        return "member/login";
    }
    @PostMapping("/login")
    public void loginPOST() {
    }
    @GetMapping("/signup")
    public String signUp() {
        return "member/signUp";
    }
    @PostMapping("/signup")
    public void signUpPOST() {
    }
}