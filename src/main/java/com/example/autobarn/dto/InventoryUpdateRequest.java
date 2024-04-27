package com.example.autobarn.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InventoryUpdateRequest {
    // Getters and Setters
    private Integer quantity;
    private String description;

}
