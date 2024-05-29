package com.example.check24.repository;

import com.example.check24.model.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<MyOrder, Long> {
}
