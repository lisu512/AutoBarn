package com.example.autobarn.repository;

import com.example.autobarn.entity.Orderitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<Orderitem, Integer> {
    // 可以添加根据关联的itemId查找OrderItem的方法
    List<Orderitem> findByItemId(Integer itemId);
}
