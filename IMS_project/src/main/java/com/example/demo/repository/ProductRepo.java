package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Product;


import jakarta.transaction.Transactional;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	//select with or
	@Query(value="select * from product_table where product_id=:s or product_name=:sn",nativeQuery=true)
	public List<Product> getproductinfo(@Param("s") int product_id,@Param("sn")String product_name);
	
   //select with in clause
	@Query(value = "SELECT * FROM product_table WHERE product_name IN(:name1,:name2)", nativeQuery = true)
	List<Product> getProducts(@Param("name1") String name1, @Param("name2") String name2);
	
	//deletion
	@Modifying
	@Transactional
	@Query(value="delete from product_table where product_id=:s",nativeQuery=true)
	public int deleteStudentInfo(@Param("s") int product_id);
	
    //updating
	@Modifying
	@Transactional
	@Query(value="update product_table set product_id=?1 where product_id=?2",nativeQuery=true)
	public int updateStudentInfo(int newid,int oldid);
	
	
}
