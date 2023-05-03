package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Admission;
import com.cjc.main.repository.Repositoryi;
import com.cjc.main.servicei.Servicei;

@Service
public class Serviceimpl implements Servicei
{
	@Autowired
	Repositoryi ri;

	@Override
	public Admission save(Admission admission) 
	{
		return ri.save(admission);
	}

}
