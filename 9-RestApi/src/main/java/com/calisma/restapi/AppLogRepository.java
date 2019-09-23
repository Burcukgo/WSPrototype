package com.calisma.restapi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Applog;

public class AppLogRepository {

	SessionFactory sf = userRest.HibernateUtil.getSessionFactory();
	
	public void Insert( Applog log ) {
		Session sesi = sf.openSession();
		Transaction tr = sesi.beginTransaction();
		int id = (Integer) sesi.save(log);
		if (id > 0) {
			// ekleme başarılı
		}
		tr.commit();
		}
		
	
}
