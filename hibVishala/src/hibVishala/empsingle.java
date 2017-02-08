package hibVishala;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class empsingle {

	public static void main(String[] args) 
	{
		 Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		      
		    //creating seession factory object  
		    SessionFactory factory=cfg.buildSessionFactory();  
		        
		 Session session=factory.openSession(); 
		 Query query= session.createQuery("select p.firstName from Employee p");
		    List list=query.list();
		    Iterator itr=list.iterator();
		    while(itr.hasNext())
		    {
		          String  Firstname=(String) itr.next();
		    	System.out.println(Firstname);
		    	
		    	
		  
		    }

	}

}
