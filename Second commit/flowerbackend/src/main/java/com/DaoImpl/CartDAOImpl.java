package com.DaoImpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.model.*;
import com.Dao.*;

@Repository
public class CartDAOImpl implements CartDAO {
	@Autowired
	SessionFactory sessionFac;
	
	public void insertCart(Cart cart) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.persist(cart);
		session.getTransaction().commit();
		session.close();
		
	}

	
	public Cart getCart(int citemid) {
		Session session=sessionFac.openSession();	
		Transaction tx=session.beginTransaction();
		Cart r = (Cart) session.load(Cart.class, new Integer(citemid));
		System.out.println("===================> r =" +r);
		tx.commit();
		session.close();
		return r;
	}


	
	public List<Cart> retrive(String username){

		Session session1=sessionFac.openSession();
		@SuppressWarnings("rawtypes")
		Query query=session1.createQuery("from Cart where username=:username and status='N'");
		query.setParameter("username",username);
		@SuppressWarnings("unchecked")
		List<Cart> list=query.list();
		return list;
	}


	public void removeCart(Cart cart) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.delete(cart);
		session.getTransaction().commit();
		session.close();
	}

	public void updateCart(Cart cart) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.update(cart);
		session.getTransaction().commit();
		session.close();
	}
	
	public Cart getnCartID(String username)
	{
		String hql = "FROM Cart c  where c.username = :Name";
		Session session=sessionFac.openSession();	
		Query query = session.createQuery(hql);
		query.setParameter("Name",username);
		session.beginTransaction();
		Cart r = (Cart) query.uniqueResult();
		System.out.println("===================> r =" +r);
		session.getTransaction().commit();
		session.close();
		return r;
		
	}


	public CartDAOImpl(SessionFactory sessionFactory) {
		super();
		sessionFac=sessionFactory;
	}

}
