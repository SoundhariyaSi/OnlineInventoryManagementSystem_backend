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

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@CrossOrigin
@RestController
public class ProductController {

	@Autowired// 
	ProductService pser;
	
	@PostMapping("addproduct")
	public Product add(@RequestBody Product pp)
	{
		return pser.saveinfo(pp);
	}

	@PostMapping("addnproduct")
	public List<Product> addndetails(@RequestBody List<Product> pp)
	{
		return pser.savedetails(pp);
	}
	
    
	@GetMapping("showproducts")
   public List<Product> show()
   {
	   return pser.showinfo();
   }
	@GetMapping("showprodbyid/{id}")
	 public Optional<Product> showid(@PathVariable int id)
	 {
		   return pser.showbyid(id);
	 }
	
	@PutMapping("update")
	public Product modify(@RequestBody Product pp)
	{
		return pser.changeinfo(pp);
	}

	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Product pp)
	{
		return pser.updateinfobyid(id, pp);
	}
	
	@DeleteMapping("deleteproduct")
	public String del(@RequestBody Product pp )
	{
		pser.deleteinfo(pp);
		return "Deleted succesfully";
	}
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id)
	{
		pser.deleteid(id);
		
	}
	@DeleteMapping("delparamid")
	public void deletemyparamid(@RequestParam int id)
	{
		pser.deletepid(id);
		
	}

	//sort by size
	@GetMapping("sort/{size}")
	public List<Product> getsortinfo(@PathVariable String size)
	{
		return pser.sortinfo(size);
	}
	//sort by color
	@GetMapping("sortt/{color}")
	public List<Product> getsortColorinfo(@PathVariable String color)
	{
		return pser.sortcolorinfo(color);
	}
	
	
	//paging
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Product> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return pser.getbypage(pageno, pagesize);
	}
	
	//Query 
	@GetMapping("/getnew/{product_id}/{product_name}")
	public List<Product> displayalldet(@PathVariable int product_id,@PathVariable String product_name)
	{
		return pser.getdetails(product_id,product_name);
	}
	//DeletionQuery
	@DeleteMapping("deletequery/{product_id}")
	public String delstudetails(@PathVariable int product_id)
	{
		return pser.delstu(product_id)+"deleted";
	}
	//UpdatingQuery
	@PutMapping("updatequery/{newid}/{oldid}")
	public String updatestudetails(@PathVariable int newid,@PathVariable int oldid)
	{
		return pser.updatestu(newid, oldid)+"Updated";
	}
	//MultipleItemsQuery
	@GetMapping("/getnew1/{name1}/{name2}")
    public List<Product> displayAll(@PathVariable String name1, @PathVariable String name2) {
        return pser.getProductsByName(name1, name2);
    }
	
	
}
