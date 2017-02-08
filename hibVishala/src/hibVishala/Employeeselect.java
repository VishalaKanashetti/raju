package hibVishala;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employeeselect {

	public static void main(String[] args)
	{ //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	        
	    
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();
	    Object o=session.get(Employee.class,115);
	    if(o==null)
	    {
	    	System.out.println("not found");
	    }
	    else
	    {
	    	Employee e=(Employee)o;
	    	System.out.println("FristName="+e.getFirstName());
	    	System.out.println("FristName="+e.getLastName());
	    	System.out.println("Succesfully retrived");
	    	
	    
	          
	 
	}  
	} 
       
       
}

