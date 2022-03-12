package com.practice.EagerMappingHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) 
	{
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
		SessionFactory sessionFactory=config.buildSessionFactory();
System.out.println("Session factorey"+sessionFactory);
Session session =sessionFactory.openSession();

		try {
			System.out.println("Session");
			Transaction tx=session.beginTransaction();
			Object a1= session.get(Alien.class,1);
			//hib=(Student)session.get(Student.class,101);//getting data from database
			//session.save();//to save data into db
			//session.save();
			tx.commit();
			
		}
		catch(Exception e){
			e.printStackTrace();   
			System.out.println("Catch"+e);
		}

		session.close();
	}
}