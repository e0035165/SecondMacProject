package com.personal.School;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Teachers extends Staff {
	
	public Teachers(String name, Long idno) {
		super(name, idno);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Teachers()
	{
		
	}
	
	
	

}
