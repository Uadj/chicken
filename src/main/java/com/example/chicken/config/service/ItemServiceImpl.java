package com.example.chicken.config.service;

import com.example.chicken.domain.Item;
import com.example.chicken.domain.ItemDTO;
import com.example.chicken.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class ItemServiceImpl {

    private final ItemRepository itemRepository;

    public List<ItemDTO> findList(){
        List<Item> items = itemRepository.findAll();
        return items.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    };

    private ItemDTO convertToDTO(Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setItemName(item.getItemName());
        itemDTO.setItemContent(item.getItemContent());
        return itemDTO;
    }
}
