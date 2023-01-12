package com.amazon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg = new Configuration();
		
		//make hibernate software locating and reading cfg file
         cfg= cfg.configure("/Product.cfg.xml");
	    
	    //create SessionFactory obj
	    SessionFactory factory=cfg.buildSessionFactory();
	    
	  //create HB session obj
	    Session ses=factory.openSession();
	    
	  //write o-r mapping persistence logic
//	    Product p = ses.get(Product.class, 1003);
	    Product p = (Product) ses.get(Product.class, 1006);
	    
	    System.out.println(p.getId()+" "+p.getPname()+" "+p.getPrice());
	    //close objs
	    ses.close();
	    factory.close();


	}

}
