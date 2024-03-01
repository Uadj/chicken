package com.example.chicken.controller;

import com.example.chicken.config.service.ItemService;
import com.example.chicken.config.service.ItemServiceImpl;
import com.example.chicken.domain.ItemDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class MenuController {
    private final ItemServiceImpl itemServiceImpl;

    @GetMapping("/items")
    public String getAllItems(Model model) {
        model.addAttribute("items", itemServiceImpl.findList());
        return "menu"; // items.html로 이동
    }
}