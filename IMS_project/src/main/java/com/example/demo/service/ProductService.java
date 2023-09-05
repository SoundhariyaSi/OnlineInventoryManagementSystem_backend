package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo pr;
	
	    public Product saveinfo(Product pp)
	    {
	    	return pr.save(pp);//saving the data from repository into the database
	    }
	    public List<Product> savedetails(List<Product> pp)
	    {
	    	return (List<Product>) pr.saveAll(pp);
	    }
	    public List<Product> showinfo()
	    {
	    	return pr.findAll();// retrieving the data that has been store in the database
	    }
	    public Optional<Product> showbyid(int id)
	    {
	    	return pr.findById(id);
	    }
	    public Product changeinfo(Product pp)
	    {
	    	return pr.saveAndFlush(pp);
	    }
	    public void deleteinfo(Product pp)
	    {
	    	pr.delete(pp);
	    }
	    
	    //delete by id for path variable
	    public void deleteid(int id)
	    {
	    	pr.deleteById(id);
	    }
	    
	    //delete by id for requestParam
	    public void deletepid(int id)
	    {
	    	pr.deleteById(id);
	    }
	    public String updateinfobyid(int id,Product pp)
	    {
	    	pr.saveAndFlush(pp);
	    	if(pr.existsById(id))
	    	{
	    		return "Updated";
	    	}
	    	else
	    	{
	    		return "Enter valid id";
	    	}
	    }
	    //sorting
	    public List<Product> sortinfo(String s)
	    {
	    	return pr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	    }
	    public List<Product> sortcolorinfo(String str)
	    {
	    	return pr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,str));
	    }
	    //paging
	    public List<Product> getbypage(int pgno,int pgsize)
	    {
	    	Page<Product> p=pr.findAll(PageRequest.of(pgno, pgsize));
	    	return p.getContent();
	    }
	    
	    public Product savecatinfo(Product pp)
		   {
		    	return pr.save(pp);//saving the data from repository into the database
		   }
		    public List<Product> savecatdetails(List<Product> pp)
		    {
		    	return (List<Product>) pr.saveAll(pp);
		    }
		    public List<Product> showcatinfo()
		    {
		    	return pr.findAll();// retrieving the data that has been store in the database
		    }
	
	//Query 
	public List<Product> getdetails(int s,String b)
	{
		return pr.getproductinfo(s,b);
	}
	
	public int delstu(int id)
    {
    	return pr.deleteStudentInfo(id);
    }
    public int updatestu(int id,int id1)
    {
    	return pr.updateStudentInfo(id, id1);
    }
    public List<Product> getProductsByName(String name1, String name2) {
        return pr.getProducts(name1, name2);
    }
	    
		

}
