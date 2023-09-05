package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Signup;
import com.example.demo.service.SignupService;

@RestController
@CrossOrigin
public class SignUpController {

	@Autowired
	SignupService ss;
	

	@PostMapping("addsignup")
	public Signup addsign(@RequestBody Signup s)
	{
		return ss.savesigninfo(s);
	}

	@PostMapping("addnsignup")
	public List<Signup> addnsign(@RequestBody List<Signup> s)
	{
		return ss.savesigndetails(s);
	}
	
    
	@GetMapping("showsignup")
   public List<Signup> showsign()
   {
	   return ss.showsigninfo();
   }
}
