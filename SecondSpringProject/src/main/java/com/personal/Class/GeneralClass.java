package com.personal.Class;

import java.util.List;

import com.personal.Library.TechnicalAffairs;
import com.personal.School.Teachers;

public class GeneralClass implements TechnicalAffairs {
	private Integer level;
	private List<Subject>noofsubjects;
	private Teachers headteacher;

	public GeneralClass(Integer level, List<Subject> noofsubjects, Teachers headteacher) {
		super();
		this.level = level;
		this.noofsubjects = noofsubjects;
		this.headteacher = headteacher;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<Subject> getNoofsubjects() {
		return noofsubjects;
	}

	public void setNoofsubjects(List<Subject> noofsubjects) {
		this.noofsubjects = noofsubjects;
	}

	public Teachers getHeadteacher() {
		return headteacher;
	}

	public void setHeadteacher(Teachers headteacher) {
		this.headteacher = headteacher;
	}

	@Override
	public void fixRGBSystem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isRGBsystemfailing() {
		// TODO Auto-generated method stub
		return false;
	}
	
	void addSubjects(Subject sbjt)
	{
		this.noofsubjects.add(sbjt);
	}

}
