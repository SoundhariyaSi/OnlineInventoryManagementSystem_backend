package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Signup;
import com.example.demo.repository.SignupRepo;

@Service
public class SignupService {

	@Autowired
	SignupRepo sr;
	
	 public Signup savesigninfo(Signup s)
	    {
	    	return sr.save(s);//saving the data from repository into the database
	    }
	    public List<Signup> savesigndetails(List<Signup> s)
	    {
	    	return (List<Signup>) sr.saveAll(s);
	    }
	    public List<Signup> showsigninfo()
	    {
	    	return sr.findAll();// retrieving the data that has been store in the database
	    }
}
