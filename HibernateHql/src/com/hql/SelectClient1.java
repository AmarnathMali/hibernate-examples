package com.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class SelectClient1 {

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
	    Query qry =ses.createQuery("from Product p");
	   /* List l = qry.list();
	    for(int i = 0; i < l.size();i++){
	    	Product p = (Product) l.get(i);
	    	System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
	    }*/
	    
	    
	   Iterator it = qry.iterate();
	   while(it.hasNext()){
		   Product p = (Product) it.next();
		   System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
	   }
	    
	    
	    //close objs
	    ses.close();
	    factory.close();




	}

}
