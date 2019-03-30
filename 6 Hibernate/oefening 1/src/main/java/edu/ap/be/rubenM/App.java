package edu.ap.be.rubenM;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
/**
 * Hello world!
 *
 */
public class App 
{
    private static SessionFactory factory; 

    public static void main(String[] args) {
      
        try {
           factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) { 
           System.err.println("Failed to create sessionFactory object." + ex);
           throw new ExceptionInInitializerError(ex); 
        }
        
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;
        
        try {
           tx = session.beginTransaction();
           Battle battle = new Battle(1999, "begin");
           employeeID = (Integer) session.save(battle); 
           tx.commit();
        } catch (HibernateException e) {
           if (tx!=null) tx.rollback();
           e.printStackTrace(); 
        } finally {
           session.close(); 
        }

    }  
}