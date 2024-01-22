package com.Demo.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
    	
    	
    	ApplicationContext  context = new	ClassPathXmlApplicationContext("Spring.xml");
    	
   Good staff =	 context.getBean(Good.class);
    Staff staff2 =  context.getBean(Sharom.class);
    staff.assist();
    staff2.assist();
    System.out.println(staff.getQualifaction()
);
    
    }
}
