package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.val;

@SpringBootApplication
public class LombokDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
		
	    var  k=10.25;  // int variable
	    
	   
	    val a=10; // final int variable
	    
	    
	    Employee emp=new Employee(100,null,50000);
	   
	   
		
		
	}

}
