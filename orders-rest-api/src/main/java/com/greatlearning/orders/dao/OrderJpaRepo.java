package com.greatlearning.orders.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.orders.model.Order;

@Repository
public interface OrderJpaRepo extends JpaRepository<Order, Long> {

}
