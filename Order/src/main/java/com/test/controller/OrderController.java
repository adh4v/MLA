package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Order;
import com.test.service.OrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(description = "Simple Exception Handling", name = "Order Controller API")
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/products")
public class OrderController {
	@Autowired
	private OrderService service;
	@Operation(summary = "post method",description = "Getting Data")
	public void setService(OrderService service) {
		this.service = service;
	}
	@PostMapping("/create")
	public ResponseEntity<Order> createProduct(@RequestBody Order pr)
	{
		//product object
		
		Order prObj = service.createOrder(pr);
		
		return new ResponseEntity<>(prObj, HttpStatus.CREATED);
	}

	@GetMapping("/listAll")
	public ResponseEntity<List<Order>> listAllOrder()
	{
		List<Order> listPr = service.readAllOrder();
		
		return new ResponseEntity<>(listPr, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Order> updateOrder(@RequestBody Order pr, @PathVariable("id") int id)
	{
		pr.setId(id);
		
		Order obj = (Order) service.updateOrder(pr);
		
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}

	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<List<Order>> deleteOrder(@PathVariable("id") int id)
	{
		service.deleteOrder(id);
		
		List<Order> listD = service.readAllOrder();
		
		return new ResponseEntity<>(listD, HttpStatus.ACCEPTED);
	}

	
}
