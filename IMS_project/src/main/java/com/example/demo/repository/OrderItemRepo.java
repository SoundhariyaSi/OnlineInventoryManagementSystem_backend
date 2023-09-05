package com.example.demo.repository;



//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.demo.model.OrderItem;



public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {

   
	
	
}
