package com.test.dao;

import java.util.List;

import com.test.entity.Order;


public interface OrderDao {
	
	
	public Order createOrder(Order o);
	
	public List<Order> readAllOrder();
	
	public Order updateOrder(Order o);
	
	public List<Order> deleteOrder(int id);

}
