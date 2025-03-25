package com.test.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.OrderDao;
import com.test.entity.Order;
import com.test.respository.OrderRepository;

import jakarta.transaction.Transactional;
@Repository
public class OrderDaoImpl implements OrderDao{
	@Autowired
	private OrderRepository repo;

	public void setRepo(OrderRepository repo) {
		this.repo = repo;
	}
	@Override	
	public Order createOrder(Order o)
	{
		return repo.save(o);
	}
	@Override
	public Order updateOrder(Order o) {
	
		return repo.save(o);
	}

	@Override
	public List<Order> deleteOrder(int id) {
		repo.deleteById(id);
		return repo.findAll();
				
	}
	@Override
	public List<Order> readAllOrder() {
		return repo.findAll();
	}
}
