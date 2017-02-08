package hibVishala;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class employee1 
{
	public static void main(String args[])
	{
		 Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		      
		    //creating seession factory object  
		    SessionFactory factory=cfg.buildSessionFactory();  
		        
		    
		    //creating session object  
		    Session session=factory.openSession(); 
		    Query query= session.createQuery("FROM Employee");
		    List list=query.list();
		    Iterator itr=list.iterator();
		    while(itr.hasNext())
		    {
		    	Object o=(Object)itr.next();
		    	Employee p=(Employee)o;
		    	//System.out.println("FristName="+p.getFirstName());
		    	System.out.println("LastName="+p.getLastName());
		    	//System.out.println("Id="+p.getId());
		    }
		      
		    //creating transaction object  
		    Transaction t=session.beginTransaction();
		   
	}

}
