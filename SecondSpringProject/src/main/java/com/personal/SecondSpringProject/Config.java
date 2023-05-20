package com.personal.SecondSpringProject;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.personal.Class.GeneralClass;
import com.personal.Class.Subject;
import com.personal.School.Teachers;

@Configuration
public class Config {
	
	@Bean
	public Teachers getTeacher(String name, Long id)
	{
		return new Teachers(name,id);
	}
	
//	@Bean
//	public GeneralClass setGeneralClass(Integer level, List<Subject> noofsubjects, Teachers headteacher)
//	{
//		return new GeneralClass(level,noofsubjects,headteacher);
//	}
	

}
