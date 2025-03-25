package com.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.OrderDao;
import com.test.entity.Order;
import com.test.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
		@Autowired
		private OrderDao orderDao;
		public void setOrderDao(OrderDao orderDao) {
			this.orderDao = orderDao;
		}

		@Override
		public Order createOrder(Order cst) {
			
			try 
			{
				if(cst!=null)
				{
					orderDao.createOrder(cst);
				}
			}
			catch(RuntimeException e)
			{
				e.printStackTrace();
			}
			return cst;
		}

		@Override
		public List<Order> readAllOrder() {
			
			List<Order> list= orderDao.readAllOrder();
				if(list.size()<0)
				{
					System.out.println("No Content");
			
				}
			
			return list;
		}

		@Override
		public Order updateOrder(Order cus) {
				
			
			return orderDao.updateOrder(cus);
		}

		@Override
		public List<Order> deleteOrder(int id) {
			try {
				if(id !=0)
				{
					orderDao.deleteOrder(id);
				}
			}
			catch(RuntimeException e)
			{
				e.printStackTrace();
			}
			return orderDao.readAllOrder();
		}



}
