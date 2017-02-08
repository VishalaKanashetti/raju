package com.hibernate.crud;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.pojodto.Student;
import com.hibernate.utillity.HibernateUtil;

public class UpdateStudent {

 /**
  * @param args
  */
 public static void main(String[] args) 
 {
  //Create session factory object
	 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  
  Student student = (Student)session.get(Student.class, 2);
  student.setStudentName("Sweety Rajput");
  System.out.println("Updated Successfully");
  System.out.println("ANUVISHU");
  session.getTransaction().commit();
  sessionFactory.close();
 }
}