package com.personal.SecondSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.personal.School.Teachers;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
    	Object[] Args = {"Jack", 14l};
    	Teachers ctr = (Teachers) ctx.getBean("getTeacher", Teachers.class);
    	//System.out.println(ctr.toString());
    	
    }
}
