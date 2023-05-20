package com.personal.School;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class Staff {
	@Autowired
	String name;
	@Autowired
	Long idno;
	public Staff(String name, Long idno) {
		super();
		this.name = name;
		this.idno = idno;
	}
	
	public Staff()
	{
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdno() {
		return idno;
	}

	public void setIdno(Long idno) {
		this.idno = idno;
	}
	
	
}
