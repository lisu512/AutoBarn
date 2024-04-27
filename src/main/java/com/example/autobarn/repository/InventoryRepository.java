package com.example.autobarn.repository;

import com.example.autobarn.entity.Inventory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
