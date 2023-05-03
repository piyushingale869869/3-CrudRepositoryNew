package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/getadmission")
	public Iterable<Admission> get()
	{
		return si.get();
	}
	
	@DeleteMapping("/admission/{sid}")
	public void delete(@PathVariable Integer sid)
	{
		si.delete(sid);
	}
	
	@PutMapping("/admission/{sid}")
	public Admission update(@RequestBody Admission admission, @PathVariable Integer sid)
	{
		return si.update(admission,sid);
	}
	

}
