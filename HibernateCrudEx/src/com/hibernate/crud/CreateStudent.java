package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.pojodto.Student;
import com.hibernate.utillity.HibernateUtil;

public class CreateStudent {

 /**
  * @param args
  */
 public static void main(String[] args) 
 {
  //Create student entity object
  Student student = new Student();
  student.setStudentName("Vishala Kanashetti");
  student.setRollNumber(01);
  student.setCourse("B.E");
  //Create session factory object
  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  
  session.save(student);
  System.out.println("Inserted Successfully");
  session.getTransaction().commit();
  session.close();
  sessionFactory.close();
 }
}