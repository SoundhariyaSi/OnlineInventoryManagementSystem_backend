package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.OrderItem;
import com.example.demo.repository.OrderItemRepo;

@Service
public class OrderItemService {

	@Autowired
	
    OrderItemRepo oir;

     public OrderItem saveinfo(OrderItem oi)
    {
    	return oir.save(oi);//saving the data from repository into the database
    }
    public List<OrderItem> savedetails(List<OrderItem> oi)
    {
    	return (List<OrderItem>) oir.saveAll(oi);
    }
    public List<OrderItem> showinfo()
    {
    	return oir.findAll();// retrieving the data that has been store in the database
    }
    public Optional<OrderItem> showbyid(int id)
    {
    	return oir.findById(id);
    }
    public OrderItem changeinfo(OrderItem oi)
    {
    	return oir.saveAndFlush(oi);
    }
    public void deleteinfo(OrderItem oi)
    {
    	oir.delete(oi);
    }
    
    //delete by id for path variable
    public void deleteid(int order_item_id)
    {
    	oir.deleteById(order_item_id);
    }
    
    //delete by id for requestParam
    public void deletepid(int id)
    {
    	oir.deleteById(id);
    }
    public String updateinfobyid(int order_item_id,OrderItem oi)
    {
    	oir.saveAndFlush(oi);
    	if(oir.existsById(order_item_id))
    	{
    		return "Updated";
    	}
    	else
    	{
    		return "Enter valid id";
    	}
    }
  
  
 
}
