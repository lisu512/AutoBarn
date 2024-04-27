// InventoryService.java
package com.example.autobarn.service;

import com.example.autobarn.dto.InventoryDTO;
import com.example.autobarn.dto.InventoryUpdateRequest;
import com.example.autobarn.entity.Inventory;
import com.example.autobarn.repository.InventoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public InventoryDTO addInventoryItem(InventoryDTO inventoryDTO) {
        Inventory inventory = new Inventory();
        BeanUtils.copyProperties(inventoryDTO, inventory);
        Inventory savedInventory = inventoryRepository.save(inventory);
        return convertToDTO(savedInventory);
    }

    public InventoryDTO updateInventoryItem(Long itemId, InventoryUpdateRequest request) {
        Inventory inventory = inventoryRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Item not found"));
        inventory.setQuantity(request.getQuantity());
        inventory.setDescription(request.getDescription());
        Inventory updatedInventory = inventoryRepository.save(inventory);
        return convertToDTO(updatedInventory);
    }

    private InventoryDTO convertToDTO(Inventory inventory) {
        InventoryDTO dto = new InventoryDTO();
        BeanUtils.copyProperties(inventory, dto);
        return dto;
    }
}
