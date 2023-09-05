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

import com.example.demo.model.OrderItem;
import com.example.demo.service.OrderItemService;


@RestController
@CrossOrigin
public class OrderItemController {

	@Autowired// 
	OrderItemService o;
	
	@PostMapping("addorderitem")
	public OrderItem add(@RequestBody OrderItem oi)
	{
		return o.saveinfo(oi);
	}

	@PostMapping("addnorderitems")
	public List<OrderItem> addndetails(@RequestBody List<OrderItem> oi)
	{
		return o.savedetails(oi);
	}
	
    
	@GetMapping("showorderitem")
   public List<OrderItem> show()
   {
	   return o.showinfo();
   }
	@GetMapping("showorderbyid/{id}")
	 public Optional<OrderItem> showid(@PathVariable int id)
	 {
		   return o.showbyid(id);
	 }
	
	@PutMapping("updateoi")
	public OrderItem modify(@RequestBody OrderItem oi)
	{
		return o.changeinfo(oi);
	}

	@PutMapping("oiupdatebyid/{order_item_id}")
	public String modifybyid(@PathVariable int order_item_id,@RequestBody OrderItem oi)
	{
		return o.updateinfobyid(order_item_id, oi);
	}
	
	@DeleteMapping("deleteorders")
	public String del(@RequestBody OrderItem oi )
	{
		o.deleteinfo(oi);
		return "Deleted succesfully";
	}
	@DeleteMapping("oidelid/{order_item_id}")
	public void deletemyid(@PathVariable int order_item_id)
	{
		o.deleteid(order_item_id);
		
	}
	@DeleteMapping("oidelparamid")
	public void deletemyparamid(@RequestParam int id)
	{
		o.deletepid(id);
		
	}


	
	
}
