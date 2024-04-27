package com.example.autobarn.controller;

import com.example.autobarn.dto.OrderDTO;
import com.example.autobarn.dto.OrderStatusUpdateRequest;
import com.example.autobarn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // 创建订单
    @PostMapping
    public ResponseEntity<Object> createOrder(@RequestBody OrderDTO orderDTO) {
        try {
            OrderDTO newOrder = orderService.createOrder(orderDTO);
            return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    // 更新订单状态
    @PutMapping("/{orderId}")
    public ResponseEntity<Object> updateOrderStatus(@PathVariable Integer orderId, @RequestBody OrderStatusUpdateRequest statusUpdate) {
        try {
            OrderDTO updatedOrder = orderService.updateOrderStatus(orderId, statusUpdate.getStatus());
            return ResponseEntity.ok(updatedOrder);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

}
