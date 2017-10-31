package com.DaoImpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Dao.ProductDAO;
import com.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO
  {
	@Autowired
	SessionFactory sessionFac;
	
	public void insertProduct(Product product) 
	  {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.persist(product);
		session.getTransaction().commit();
		session.close();
		
	}

	
	public Product getProduct(int pitemid) {
		Session session=sessionFac.openSession();	
		Transaction tx=session.beginTransaction();
		Product r = (Product) session.load(Product.class, new Integer(pitemid));
		System.out.println("===================> r =" +r);
		tx.commit();
		session.close();
		return r;
	}


	
	public List<Product> retrive(String username){

		Session session1=sessionFac.openSession();
		@SuppressWarnings("rawtypes")
		Query query=session1.createQuery("from Product where username=:username and status='N'");
		query.setParameter("username",username);
		@SuppressWarnings("unchecked")
		List<Product> list=query.list();
		return list;
	}


	public void removeProduct(Product product) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.delete(product);
		session.getTransaction().commit();
		session.close();
	}

	public void updateProduct(Product product) {
		Session session=sessionFac.openSession();	
		session.beginTransaction();
		session.update(product);
		session.getTransaction().commit();
		session.close();
	}
	
	public Product getnProductID(String username)
	{
		String hql = "FROM Product p  where p.username = :Name";
		Session session=sessionFac.openSession();	
		Query query = session.createQuery(hql);
		query.setParameter("Name",username);
		session.beginTransaction();
		Product p = (Product) query.uniqueResult();
		System.out.println("===================>p =" +p);
		session.getTransaction().commit();
		session.close();
		return p;
		
	}


	public ProductDAOImpl(SessionFactory sessionFactory) {
		super();
		sessionFac=sessionFactory;
	}

}

	


