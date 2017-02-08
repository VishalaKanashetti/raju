package vishanu;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
/**
 * This servlet program is used to print "Hello World" on 
 * client browser using GenericServlet class.
 * @author javawithease
 */
public class HelloWorld extends GenericServlet {
    private static final long serialVersionUID = 1L;
 
    //no-argument constructor.
    public HelloWorld() {
 
    }
 
    @Override
    public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	System.out.println("VISHALA");
 
        out.println("<h1>Hello World example using" +
	    		" GenericServlet class.</h1>");
        out.close();		
    }
}
