package com.sumit.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.Repository.OrderDetailsRepo;
import com.sumit.entity.OrderDetailsEntity;


@RestController
@RequestMapping("/api")
public class OrderDetailsController {

	@Autowired
	private OrderDetailsRepo orderDetailsRepo;
	
	@PostMapping("/create")
	public ResponseEntity<OrderDetailsEntity> createOrder(@RequestBody OrderDetailsEntity orderValue){
	   Date date=new Date();
	   OrderDetailsEntity order=new OrderDetailsEntity();
	   order.setOrderBy(orderValue.getOrderBy());
	   order.setOrderPlacedDate(date);
	   OrderDetailsEntity res=orderDetailsRepo.save(order);
	   return new ResponseEntity<OrderDetailsEntity>(res,HttpStatus.OK);
		
	}
	
	
}
