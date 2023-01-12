package com.hql;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SelectClient2 {

	public static void main(String[] args) {


		//activate hibernate software
		Configuration cfg = new Configuration();
		
		//make hibernate software locating and reading cfg file
	    cfg=cfg.configure("/Product.cfg.xml");
	    
	    //create SessionFactory obj
	    SessionFactory factory=cfg.buildSessionFactory();
	    
	  //create HB session obj
	    Session ses=factory.openSession();
	    
	  //write o-r mapping persistence logic
	   
	    Query qry = ses.createQuery("select  p.pname,p.price from Product p");
	    
	    //way-1: to retrive data
	    List l = qry.list();
	    
	    for(int i=0;i<l.size();i++)
	    {
	    	 Object obj[] =  (Object[]) l.get(i);
	    	 for(int j=0;j<obj.length;j++)
	    	 {
	    		 System.out.print(obj[j]+" "); 
	    	 }
	    	System.out.println();
	    }

	    //close objs
	    ses.close();
	    factory.close();
	}

}
