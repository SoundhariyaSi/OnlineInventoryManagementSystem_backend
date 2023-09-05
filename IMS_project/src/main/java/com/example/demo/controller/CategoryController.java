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

import com.example.demo.model.Category;

import com.example.demo.service.CategoryService;

@CrossOrigin
@RestController
public class CategoryController {

	@Autowired
	CategoryService cs;
	
	@PostMapping("addcategory")
	public Category addcat(@RequestBody Category c)
	{
		return cs.savecatinfo(c);
	}

	@PostMapping("addncategory")
	public List<Category> addncat(@RequestBody List<Category> c)
	{
		return cs.savecatdetails(c);
	}
	
    
	@GetMapping("showcat")
   public List<Category> showcat()
   {
	   return cs.showcatinfo();
   }
	@GetMapping("showcatbyid/{id}")
	 public Optional<Category> showcatid(@PathVariable int id)
	 {
		   return cs.showbycid(id);
	 }
	
	@PutMapping("updatec")
	public Category modifycat(@RequestBody Category c)
	{
		return cs.changecatinfo(c);
	}

	@PutMapping("cupdatebyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Category c)
	{
		return cs.updateinfobyid(id, c);
	}
	
	@DeleteMapping("deletecat")
	public String delcat(@RequestBody Category c )
	{
		cs.deletecatinfo(c);
		return "Deleted succesfully";
	}
	@DeleteMapping("cdelid/{id}")
	public void deletemyid(@PathVariable int id)
	{
		cs.deleteid(id);
		
	}
	@DeleteMapping("cdelparamid")
	public void deletemyparamid(@RequestParam int id)
	{
		cs.deletepid(id);
		
	}
}
