package com.amazon;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductClient {

	public static void main(String[] args) {
		//activate hibernate software
				Configuration cfg = new Configuration();
				
				//make hibernate software locating and reading cfg file
                 cfg= cfg.configure("/Product.cfg.xml");
			    
			    //create SessionFactory obj
			    SessionFactory factory=cfg.buildSessionFactory();
			    
			  //create HB session obj
			    Session ses=factory.openSession();
			    
			  //write o-r mapping persistence logic
			    //create object for HB POJO class with data
			    
			    Product p = new Product();
			    p.setId(1005);
			    p.setPname("mava");
			    p.setPrice(21600.99);
			    
			    //make HB software insert record
			    Transaction tx=ses.beginTransaction();
			    ses.saveOrUpdate(p);
			    tx.commit();
			    
			    //close objs
			    ses.close();
			    factory.close();

		
	}

}
