package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SelectClient4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg = cfg.configure("/Product.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Query qry = ses.createQuery("from Product p where p.pid >:p1 and p.pname like: p2");
		
		qry.setInteger("p1",1001);
		qry.setString("p2", "s%");
		List l = qry.list();
		for(int i = 0; i < l.size();i++){
			Product p = (Product) l.get(i);
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
		}
		
		ses.close();
		factory.close();

	}

}
