package com.klef.jfsd.springboot.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.exam.service.APIService;

@RestController
@RequestMapping("api")

public class ClientController 
{
	@Autowired
	private APIService service;
	
	@GetMapping("/")
	public String demo()
	{
		return "<h2>API Demo</h2>";
	}
	
	@GetMapping("demo1")
	public List<Object> demo1()
	{
		return service.displayAllUsers();
	}
	
	@GetMapping("demo2/{id}")
	public Object demo2(@PathVariable("id")int uid)
	{
		return service.displayUserById(uid);
	}

}
