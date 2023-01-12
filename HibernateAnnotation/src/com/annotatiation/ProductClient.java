package com.annotatiation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.annotatiation.Product;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg = cfg.configure("/Product.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Product p1 = new Product();
		p1.setPname("rama");
		p1.setPrice(45343);
		
		Transaction tx = ses.beginTransaction();
		
		ses.saveOrUpdate(p1);
		tx.commit();
		ses.close();
		factory.close();

	}

}
