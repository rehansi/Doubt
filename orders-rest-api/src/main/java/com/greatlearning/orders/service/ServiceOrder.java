package com.greatlearning.orders.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.orders.dao.OrderJpaRepo;
import com.greatlearning.orders.model.Order;

@Service
public class ServiceOrder {
	//This class have dependency on repository
	 @Autowired
	private OrderJpaRepo orderjparepo;
	
    public Order SaveOrder (Order order) {
    	return this.orderjparepo.save(order);
    }
    
    public Order updateOrder(long id , Order order) {
		Order existingOrder= this.orderjparepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid order id"));
    	existingOrder.setName(order.getName());
    	existingOrder.setAmount(order.getAmount());
    	return this.orderjparepo.save(existingOrder);
    }
    
    public Set<Order> fetchAllOrders() {
    	return Set.copyOf(this.orderjparepo.findAll());
    }
    public Order findOrderById(long id) {
    	return this.orderjparepo.findById(null).orElseThrow(() -> new IllegalArgumentException("Invalid order id ")) ; 
    	
    }
    
    public void deletebyId(long id) {
    	this.orderjparepo.deleteById(id);
    }
}
