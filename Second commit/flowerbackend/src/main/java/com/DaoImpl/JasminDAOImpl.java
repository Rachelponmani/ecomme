package com.DaoImpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.JasminDAO;
import com.model.Jasmin;

@Repository
public class JasminDAOImpl implements JasminDAO {
	@Autowired
	SessionFactory sessionFac;
	
	
	@SuppressWarnings("unchecked")
	public  List<Jasmin> getAllJasmin() {
		Session session = sessionFac.openSession();
		session.beginTransaction();
		List<Jasmin> jasminlist = session.createQuery("from Jasmin").list();
		session.getTransaction().commit();
		session.close();
		return jasminlist;
		
	}
	
	public Jasmin getJasmin(int ID) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		Jasmin j = (Jasmin) session.load(Jasmin.class,new Integer(ID));
		System.out.println("===================> j =" +j);
		session.getTransaction().commit();
		session.close();
		return j;
		
	}
	
	public Jasmin getJasminName(String Name) {
		String hql = "FROM Jasmin j  where j.NAME = :Name";
		Session session=sessionFac.openSession();	
		Query query = session.createQuery(hql);
		query.setParameter("Name",Name);
		session.beginTransaction();
		System.out.println("Hereitis");
		Jasmin j = (Jasmin) query.uniqueResult();
		System.out.println("Hereitis");
		
		session.getTransaction().commit();
		session.close();
		return j;
		
	}
	
	public void createJasmin(Jasmin jasmin){

		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.persist(jasmin);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteJasmin(Jasmin jasmin) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.delete(jasmin);
		session.getTransaction().commit();
		session.close();
		
	}
	public void updateJasmin(Jasmin jasmin) {
		
		System.out.println("-------------------------------->jasmin details in dao : "+jasmin.getID());
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.update(jasmin);
		System.out.println("----------------------------> updated------------------------------>");
		session.getTransaction().commit();
		System.out.println("-----------------------------> committed---------------------------->");
		//session.flush();
		System.out.println("---------------------------------> session is closing-------------------->");
		session.close();
		
	}
	
	public JasminDAOImpl(SessionFactory sessionFactory)
	{
		super();
		sessionFac=sessionFactory;
		
	}	
	

	
}
