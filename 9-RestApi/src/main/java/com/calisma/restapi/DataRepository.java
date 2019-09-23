package com.calisma.restapi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Subscriber;




public class DataRepository {
	
	SessionFactory sf = userRest.HibernateUtil.getSessionFactory();
	
	
	public List<Subscriber> List() {
		
		Session sesi = sf.openSession();
		List<Subscriber> ls = sesi.createQuery("from Subsciber order by id desc").list();
		return ls;
	}
	
	
public List<Subscriber> ListById(int id ) {
		
		Session sesi = sf.openSession();
		Subscriber subcntrl = (Subscriber) sesi.createQuery("from Subscriber where id = ?  ")
				.setParameter(0, id)
				.list()
				.get(0);
		List<Subscriber> ls= new ArrayList<Subscriber>();
		ls.add(subcntrl);
		return ls;
	}
	
	public void Insert( Subscriber s ) {
	Session sesi = sf.openSession();
	Transaction tr = sesi.beginTransaction();
	int id = (Integer) sesi.save(s);
	if (id > 0) {
		// ekleme başarılı
	}
	tr.commit();
	}
	
	
	
public boolean Delete(Subscriber s ) {
		
		Session sesi = sf.openSession();	
		try {
			//id controll
			Subscriber subcntrl = (Subscriber) sesi.createQuery("from Subscriber where id = ?  ")
					.setParameter(0, s.getId())
					.list()
					.get(0);
			System.out.println("deleted user : " + subcntrl.getName());
		} catch (Exception e) {
			return false;
		}
		Transaction tr = sesi.beginTransaction();
		Subscriber sub  = sesi.load(Subscriber.class, s.getId() );
		sesi.delete(sub);
		tr.commit();
	return true;	
}



public boolean Update(Subscriber s ) {
	try {
		Session sesi = sf.openSession();
		Subscriber subcntrl = (Subscriber) sesi.createQuery("from Subscriber where id= ? ")
				.setParameter(0, s.getId())
				.list()
				.get(0);
		System.out.println("updated subscriber : " + subcntrl.getName());
	} catch (Exception e) {
		return false;
	}
	Session sesi = sf.openSession();
	Transaction tr = sesi.beginTransaction();
	sesi.update(s);
	tr.commit();
	
return true;	
}
}
