package com.example.chicken.controller;

import com.example.chicken.config.service.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MenuController {
    private final ItemServiceImpl itemServiceImpl;

    @GetMapping("/items")
    public String getAllItems(Model model) {
        model.addAttribute("items", itemServiceImpl.findList());
        return "items"; // items.html로 이동
    }
}