package com.DaoImpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.LilyDAO;
import com.model.Lily;

@Repository
public class LilyDAOImpl implements LilyDAO {
	@Autowired
	SessionFactory sessionFac;
	
	@SuppressWarnings("unchecked")
	public  List<Lily> getAllLily() {
		Session session = sessionFac.openSession();
		session.beginTransaction();
		List<Lily> Lilylist = session.createQuery("from Lily").list();
		session.getTransaction().commit();
		session.close();
		return Lilylist;
		
	}
	public Lily getLily(int ID) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		Lily l = (Lily) session.load(Lily.class,new Integer(ID));
		System.out.println("===================> l =" +l);
		session.getTransaction().commit();
		session.close();
		return l;
		
	}
	
	public Lily getLilyName(String Name) {
		String hql = "FROM Lily l  where l.NAME = :Name";
		Session session=sessionFac.openSession();	
		Query query = session.createQuery(hql);
		query.setParameter("Name",Name);
		session.beginTransaction();
		System.out.println("Hereitis");
		Lily l = (Lily) query.uniqueResult();
		System.out.println("Hereitis");
		session.getTransaction().commit();
		session.close();
		return l;
		
	}
	
	public void createLily(Lily lily){

		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.persist(lily);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteLily(Lily lily) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.delete(lily);
		session.getTransaction().commit();
		session.close();
		
	}
	public void updateLily(Lily lily) {
		
		System.out.println("-------------------------------->rose details in dao : "+lily.getID());
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.update(lily);
		System.out.println("----------------------------> updated------------------------------>");
		session.getTransaction().commit();
		System.out.println("-----------------------------> committed---------------------------->");
		//session.flush();
		System.out.println("---------------------------------> session is closing-------------------->");
		session.close();
		
	}
	public LilyDAOImpl(SessionFactory sessionFactory)
	{
		super();
		sessionFac=sessionFactory;
		
	}	

}
