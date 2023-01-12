package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SelectClient5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg = cfg.configure("/Product.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Query qry = ses.createQuery("select count(*),max(p.pid),min(p.pid),avg(p.pid),sum(p.pid) from Product p");
		
		
		List l = qry.list();
		Object[] res =(Object[])l.get(0);
		Long res1 = (Long)res[0];
		long count = res1.longValue();
		System.out.println(count);
		
		Integer res2 = (Integer)res[1];
	    int maxpid = res2.intValue();
	    System.out.println("max pid is:"+maxpid);
	    
	    Integer res3 = (Integer)res[2];
	    int minpid = res3.intValue();
	    System.out.println("min pid is:"+minpid);
	    
	    Long res4 = (Long)res[3];
	    long sum = res4.longValue();
	    System.out.println("sum is:"+sum);
	    
	    Double res5 = (Double)res[4];
	    double avg = res5.doubleValue();
	    System.out.println("avg is:"+avg);

		ses.close();
		factory.close();
	}

}
