package com.cjc.main.serviceimpl;

import java.util.Optional;

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

	@Override
	public Iterable<Admission> get() 
	{
		return ri.findAll();
	}

	@Override
	public void delete(Integer sid) 
	{
		ri.deleteById(sid);	
	}

	@Override
	public Admission update(Admission admission, Integer sid) 
	{
		Optional<Admission> op=ri.findById(sid);
		if(op.isPresent())
		{
			Admission ad=op.get();
			if(admission.getSname()!=null)
			{
				ad.setSname(admission.getSname());
			}
			if(admission.getSaddress()!=null)
			{
				ad.setSaddress(admission.getSaddress());
			}
			if(admission.getSmobileno()!=null)
			{
				ad.setSmobileno(admission.getSmobileno());
			}
			return ri.save(ad);
		}
		else {
			return null;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
