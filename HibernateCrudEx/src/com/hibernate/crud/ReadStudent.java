package com.hibernate.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.pojodto.Student;
import com.hibernate.utillity.HibernateUtil;

public class ReadStudent {

 /**
  * @param args
  * 
  */
 public static void main(String[] args) 
 {
  //Create session factory object
  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  Query query = session.createQuery("from Student");
  List students = query.list();
  for(Object o : students)
  {
System.out.println("Roll Number: "+((Student) o).getRollNumber()+", Student Name: "+((Student) o).getStudentName()+", Course: "+((Student) o).getCourse());
  }
  session.getTransaction().commit();
  sessionFactory.close();
 }
}