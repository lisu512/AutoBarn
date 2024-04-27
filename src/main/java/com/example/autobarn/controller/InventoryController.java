package com.example.autobarn.controller;

import com.example.autobarn.dto.InventoryDTO;
import com.example.autobarn.dto.InventoryUpdateRequest;
import com.example.autobarn.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    // 增加库存物品
    @PostMapping
    public ResponseEntity<Object> addInventoryItem(@RequestBody InventoryDTO inventoryDTO) {
        try {
            InventoryDTO newItem = inventoryService.addInventoryItem(inventoryDTO);
            return new ResponseEntity<>(newItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    // 更新库存信息
    @PutMapping("/{itemId}")
    public ResponseEntity<Object> updateInventoryItem(@PathVariable Long itemId, @RequestBody InventoryUpdateRequest request) {
        try {
            InventoryDTO updatedItem = inventoryService.updateInventoryItem(itemId, request);
            return ResponseEntity.ok(updatedItem);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("库存物品未找到");
        }
    }

}
