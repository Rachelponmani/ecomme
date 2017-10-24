package com.niit.config;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.model.Category;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit")
public class DBConfig 
  {
	public DataSource getH2DataSource()
    {
        DriverManagerDataSource driverMgrDataSource=new DriverManagerDataSource();
        driverMgrDataSource.setDriverClassName("org.h2.Driver");
        driverMgrDataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
        driverMgrDataSource.setUsername("sa");
        driverMgrDataSource.setPassword("");
        return driverMgrDataSource;
    }
     
    //Session Factory Bean Created.
    @Bean(name="sessionFactory")
    public SessionFactory getSessionFactory()
    {
        Properties hibernateProperties=new Properties();
       
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");
        hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
         
        LocalSessionFactoryBuilder localSessionFacBuilder=new LocalSessionFactoryBuilder(getH2DataSource());
        
        localSessionFacBuilder.addProperties(hibernateProperties);
        
        localSessionFacBuilder.addAnnotatedClass(Category.class);
       
        SessionFactory sessionFactory=localSessionFacBuilder.buildSessionFactory();
        System.out.println("Session Factory Object Created");
        return sessionFactory;
    }
     
    //Transaction Bean Object
    @Bean
    public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
    {
        HibernateTransactionManager hibernateTranMgr=new HibernateTransactionManager(sessionFactory);
        return hibernateTranMgr;
    }
     
}
	


