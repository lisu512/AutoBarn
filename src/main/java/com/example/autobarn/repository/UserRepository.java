package com.example.autobarn.repository;

import com.example.autobarn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // 这里可以添加一些自定义查询方法，例如根据用户名查找用户
    User findByUsername(String username);
}
