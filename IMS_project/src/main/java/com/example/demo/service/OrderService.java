package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepo;

@Service
public class OrderService {

@Autowired
	
    OrderRepo r;

     public Order saveorderinfo(Order o)
    {
    	return r.save(o);//saving the data from repository into the database
    }
    public List<Order> saveorderdetails(List<Order> o)
    {
    	return (List<Order>) r.saveAll(o);
    }
    public List<Order> showorderinfo()
    {
    	return r.findAll();// retrieving the data that has been store in the database
    }
    public Optional<Order> showbyoid(int id)
    {
    	return r.findById(id);
    }
    public Order changeorderinfo(Order o)
    {
    	return r.saveAndFlush(o);
    }
    public void deleteorderinfo(Order o)
    {
    	r.delete(o);
    }
    
    //delete by id for path variable
    public void deleteid(int order_id)
    {
    	r.deleteById(order_id);
    }
    
    //delete by id for requestParam
    public void deletepid(int id)
    {
    	r.deleteById(id);
    }
    public String updateinfobyid(int order_id,Order o)
    {
    	r.saveAndFlush(o);
    	if(r.existsById(order_id))
    	{
    		return "Updated";
    	}
    	else
    	{
    		return "Enter valid id";
    	}
    }
   
  
}
