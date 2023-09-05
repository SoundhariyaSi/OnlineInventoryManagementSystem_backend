package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@CrossOrigin
@RestController
public class OrderController {

	@Autowired
	OrderService os;
	
	@PostMapping("addorder")
	public Order add(@RequestBody Order o)
	{
		return os.saveorderinfo(o);
	}

	@PostMapping("addnorder")
	public List<Order> addndetails(@RequestBody List<Order> o)
	{
		return os.saveorderdetails(o);
	}
	
    
	@GetMapping("showorders")
   public List<Order> show()
   {
	   return os.showorderinfo();
   }
	@GetMapping("showordbyid/{id}")
	 public Optional<Order> showid(@PathVariable int id)
	 {
		   return os.showbyoid(id);
	 }
	
	@PutMapping("updateo")
	public Order modify(@RequestBody Order o)
	{
		return os.changeorderinfo(o);
	}

	@PutMapping("oupdatebyid/{order_id}")
	public String modifybyid(@PathVariable int order_id,@RequestBody Order o)
	{
		return os.updateinfobyid(order_id, o);
	}
	
	@DeleteMapping("deleteorder")
	public String del(@RequestBody Order o )
	{
		os.deleteorderinfo(o);
		return "Deleted succesfully";
	}
	@DeleteMapping("odelid/{order_id}")
	public void deletemyid(@PathVariable int order_id)
	{
		os.deleteid(order_id);
		
	}
	@DeleteMapping("odelparamid")
	public void deletemyparamid(@RequestParam int id)
	{
		os.deletepid(id);
		
	}


	
	
}
