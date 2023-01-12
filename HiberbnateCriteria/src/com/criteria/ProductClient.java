package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg = cfg.configure("/Product.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Criteria ct = ses.createCriteria(Product.class);
		List l = ct.list();
		for(int i = 0; i < l.size();i++){
			Product p = (Product) l.get(i);
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
		}
		ses.close();
		factory.close();
	}

}
