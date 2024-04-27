package com.example.autobarn.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", nullable = false)
    private Integer id;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @Column(name = "customerName", nullable = false)
    private String customerName;

    @Lob
    @Column(name = "customerAddress", nullable = false)
    private String customerAddress;

}