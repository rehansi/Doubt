package com.greatlearning.orders.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.orders.model.Order;
import com.greatlearning.orders.service.ServiceOrder;

@RestController
@RequestMapping ("/api/v1/order")        //Reuquest mapping tells whats an address localhost is the server name
public class OrderRestController {       // 8080 is the port number  /api/v1/orders/ is an address where we can
	                                     // access this api
 
	@Autowired
	private ServiceOrder orderservice;
	
	@PostMapping
	public Order saveOrder (@RequestBody Order order) {
		return this.orderservice.SaveOrder(order);
	} 
	
//	public Order updateOrder (long id , Order order) {
//		 
//	   this.orderservice.findOrderById(id)orE
//	} 
	
	@GetMapping()
	public Set<Order> fetchALLOrders(){
		return this.orderservice.fetchAllOrders();
	}
	
	@GetMapping("/{id}")
	public Order findOrderByOrderId (@PathVariable("id")long id) {
		return this.orderservice.findOrderById(id);
	}
	
	public void deleteOrderById (long id) {
		this.orderservice.deletebyId(id);
	}
}