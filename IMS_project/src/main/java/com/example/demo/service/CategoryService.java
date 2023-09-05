package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo cr;
	
	 public Category savecatinfo(Category c)
	    {
	    	return cr.save(c);//saving the data from repository into the database
	    }
	    public List<Category> savecatdetails(List<Category> c)
	    {
	    	return (List<Category>) cr.saveAll(c);
	    }
	    public List<Category> showcatinfo()
	    {
	    	return cr.findAll();// retrieving the data that has been store in the database
	    }
	    public Optional<Category> showbycid(int id)
	    {
	    	return cr.findById(id);
	    }
	    public Category changecatinfo(Category c)
	    {
	    	return cr.saveAndFlush(c);
	    }
	    public void deletecatinfo(Category c)
	    {
	    	cr.delete(c);
	    }
	    
	    //delete by id for path variable
	    public void deleteid(int id)
	    {
	    	cr.deleteById(id);
	    }
	    
	    //delete by id for requestParam
	    public void deletepid(int id)
	    {
	    	cr.deleteById(id);
	    }
	    public String updateinfobyid(int id,Category c)
	    {
	    	cr.saveAndFlush(c);
	    	if(cr.existsById(id))
	    	{
	    		return "Updated";
	    	}
	    	else
	    	{
	    		return "Enter valid id";
	    	}
	    }
	
}
