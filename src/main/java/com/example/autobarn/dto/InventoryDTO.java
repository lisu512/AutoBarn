// InventoryDTO.java
package com.example.autobarn.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InventoryDTO {
    // 添加默认的无参构造函数
    public InventoryDTO() {}

    private String name;
    private Integer quantity;
    private String description;
}
