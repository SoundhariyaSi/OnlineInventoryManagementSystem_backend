package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Signup;

public interface SignupRepo extends JpaRepository<Signup, Integer>{

}
