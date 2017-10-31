package com.DaoImpl;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Dao.RoseDAO;
import com.model.Rose;


@Repository
public class RoseDAOImpl implements RoseDAO {
	@Autowired
	SessionFactory sessionFac;
	//List<Rose> roses;
	
	
	@SuppressWarnings("unchecked")
	public  List<Rose> getAllRose() {
		Session session = sessionFac.openSession();
		session.beginTransaction();
		List<Rose> roselist = session.createQuery("from Rose").list();
		session.getTransaction().commit();
		session.close();
		return roselist;
		
	}
	
	public Rose getRose(int ID) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		Rose r = (Rose) session.load(Rose.class,new Integer(ID));
		System.out.println("===================> r =" +r);
		session.getTransaction().commit();
		session.close();
		return r;
		
	}
	
	public Rose getRoseName(String Name) {
		String hql = "FROM Rose r  where r.NAME = :Name";
		Session session=sessionFac.openSession();	
		Query query = session.createQuery(hql);
		query.setParameter("Name",Name);
		session.beginTransaction();
		Rose r = (Rose) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return r;
		
	}
	
	public Rose getAllName(String Name)
	{
		String hql = "FROM Rose r  where r.NAME = :Name";
		Session session=sessionFac.openSession();	
		Query query = session.createQuery(hql);
		query.setParameter("Name",Name);
		session.beginTransaction();
		Rose r = (Rose)query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return r;
		
	}
	
	public void createRose(Rose rose){

		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.persist(rose);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteRose(Rose rose) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.delete(rose);
		session.getTransaction().commit();
		session.close();
		
	}
	public void updateRose(Rose rose) {
		
		System.out.println("-------------------------------->rose details in dao : "+rose.getID());
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.update(rose);
		System.out.println("----------------------------> updated------------------------------>");
		session.getTransaction().commit();
		System.out.println("-----------------------------> committed---------------------------->");
		//session.flush();
		System.out.println("---------------------------------> session is closing-------------------->");
		session.close();
		
	}
	
	
public Rose setData(int iD, String nAME, String dESCRIPTION, float pRICE) {
		
	    Rose r = new Rose();
		r.setID(iD);
		r.setNAME(nAME);
		r.setDESCRIPTION(dESCRIPTION);
		r.setPRICE(pRICE);
		System.out.println("SetDATA over");
		return r;
		
	}
	
	public RoseDAOImpl(SessionFactory sessionFactory)
	{
		super();
		sessionFac=sessionFactory;
		
	}		

}
