package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfigHelperClass {
	public static SessionFactory fact;
	//to get session factory object
	public static SessionFactory getfactory() 
	{
		if(fact==null) 
		fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		return fact;
		
	}
	
	public void closefactory() 
	{
		if(fact.isOpen())
			fact.close();
	}
	
}
