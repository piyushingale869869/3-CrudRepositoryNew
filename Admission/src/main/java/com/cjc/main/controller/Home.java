package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Admission;
import com.cjc.main.servicei.Servicei;

@RestController
public class Home 
{
	@Autowired
	Servicei si;
	
	@PostMapping("/admission")
	public Admission post(@RequestBody Admission admission)
	{
		return si.save(admission);
		
	}
	

}
