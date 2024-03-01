package com.example.chicken.config.service;

import com.example.chicken.domain.ItemDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ItemService {
    public List<ItemDTO> findList();
}
