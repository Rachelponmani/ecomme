package com.hibernateConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.Dao.CartDAO;
import com.Dao.JasminDAO;
import com.Dao.LilyDAO;
import com.Dao.OrderDAO;
import com.Dao.ProductDAO;
import com.Dao.RoseDAO;
import com.Dao.UserDAO;
import com.DaoImpl.CartDAOImpl;
import com.DaoImpl.JasminDAOImpl;
import com.DaoImpl.LilyDAOImpl;
import com.DaoImpl.OrderDAOImpl;
import com.DaoImpl.ProductDAOImpl;
import com.DaoImpl.RoseDAOImpl;
import com.DaoImpl.UserDAOImpl;
import com.model.Cart;
import com.model.Jasmin;
import com.model.Lily;
import com.model.OrderDetails;
import com.model.Product;
import com.model.Rose;
import com.model.User;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class HibernateConfig {
	@Autowired
	@Bean(name="datasource")
	public DataSource getH2() {
		System.out.println("Hibernate initiated");
		DriverManagerDataSource dt=new DriverManagerDataSource();
		dt.setDriverClassName("org.h2.Driver");
		dt.setUrl("jdbc:h2:tcp://localhost/~/test");
		dt.setUsername("sa");
		dt.setPassword("");
		System.out.println("connection established");
		return dt;
	}
	private Properties getHiberProps(){
		Properties p=new Properties();
		p.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		p.put("hibernate.show_sql","true");
		p.put("hibernate.hbm2ddl.auto","update");
		return p;
	}
		@Autowired
		@Bean(name="RoseDAO")
		public RoseDAO getAllRose(SessionFactory sessionFac) {
			return new RoseDAOImpl(sessionFac);
			
		}
		
		@Autowired
		@Bean(name="JasminDAO")
		public JasminDAO getAllJasmin(SessionFactory sessionFac) {
			return new JasminDAOImpl(sessionFac);
		
		}
		
		@Autowired
		@Bean(name="LilyDAO")
		public LilyDAO getAllLily(SessionFactory sessionFac) {
			return new LilyDAOImpl(sessionFac);
		
		}
		
		@Autowired
		@Bean(name="UserDAO")
		public UserDAO getAllUsers(SessionFactory sessionFac) {
			return new UserDAOImpl(sessionFac);
		
		}
		
		@Autowired
		@Bean(name="CartDAO")
		public CartDAO getAllCarts(SessionFactory sessionFac) {
			return new CartDAOImpl(sessionFac);
		
		}
		@Autowired
		@Bean(name="OrderDAO")
		public OrderDAO createDAO(SessionFactory sessionFac) {
			return new OrderDAOImpl(sessionFac);
		
		}
		@Autowired
		@Bean(name="ProductDAO")
		public ProductDAO getAllProduct(SessionFactory sessionFac) {
			return new ProductDAOImpl(sessionFac);
		}
		
		
		@Autowired
		@Bean(name="transactionManager")
		public HibernateTransactionManager getTransaction(SessionFactory sessionFactory) {
			
			HibernateTransactionManager tm=new HibernateTransactionManager(sessionFactory);
			return tm;
		}
		@Autowired
		@Bean(name="sessionFactory")
		public SessionFactory getSession(DataSource datasource) {
			LocalSessionFactoryBuilder lsfb=new LocalSessionFactoryBuilder(datasource);
			lsfb.addProperties(getHiberProps());
			lsfb.addAnnotatedClass(Rose.class);
			lsfb.addAnnotatedClass(Jasmin.class);
			lsfb.addAnnotatedClass(Lily.class);
			lsfb.addAnnotatedClass(User.class);
			lsfb.addAnnotatedClass(Cart.class);
			lsfb.addAnnotatedClass(OrderDetails.class);
			lsfb.addAnnotatedClass(Product.class);
			return lsfb.buildSessionFactory();
		}		
		
	}


	
	/* @Autowired
	 * @Bean("name=JasminDAO")
	public JasminDAO getJasminDAO(SessionFactory sessionFactory)
	{
		System.out.println("JasminDAO object creation");
		return new JasminDAO(sessionFactory);
	}
	@Autowired
	@Bean("name=LilyDAO")
	public LilyDAO getLilyDAO(SessionFactory sessionFactory)
	{
		System.out.println("LilyDAO object creation");
		return new LilyDAO(sessionFactory);
	}
	@Autowired
	@Bean("name=PiesDAO")
	public PiesDAO getPiesDAO(SessionFactory sessionFactory)
	{
		System.out.println("PiesDAO object creation");
		return new PiesDAO(sessionFactory);
	}

	@Bean("name=RegisterDAO")
	public RegisterDAO getRegisterDAO(SessionFactory sessionFactory)
	{
		System.out.println("cartDAO object creation");
		return new RegisterDAO(sessionFactory);
	}
*/

	


