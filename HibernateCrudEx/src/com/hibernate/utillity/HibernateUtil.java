package com.hibernate.utillity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil 
{
 private static final SessionFactory sessionFactory;
 static
 {
  try
  {
   sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
  }
  catch(Throwable th){
   System.err.println("Enitial SessionFactory creation failed"+th);
   System.out.println("gjefqejaf");
   System.out.println("helllo welcome to java");
   throw new ExceptionInInitializerError(th);
  }
   }
   public static SessionFactory getSessionFactory(){
    return sessionFactory;
   }
}