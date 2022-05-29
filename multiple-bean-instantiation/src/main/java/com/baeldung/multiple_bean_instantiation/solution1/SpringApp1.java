package com.baeldung.multiple_bean_instantiation.solution1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.baeldung.multiple_bean_instantiation.solution1.Person;
import com.baeldung.multiple_bean_instantiation.solution1.PersonConfig;

/**
 * Hello world!
 *
 */
public class SpringApp1 
{
    public static void main( String[] args )
    {
    	// Initializing the spring container
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
    	
    	Person person = context.getBean("personOne", Person.class);
    	
    	System.out.println(person);
    	
    	context.close();
    }
}
