package com.test.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	           
}
