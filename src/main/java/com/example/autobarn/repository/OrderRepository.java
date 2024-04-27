package com.example.autobarn.repository;

import com.example.autobarn.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    // 可以添加根据订单状态或客户名等进行查询的方法
}
