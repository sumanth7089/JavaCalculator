package mypackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculator extends HttpServlet
{
	public long addFucn(long first,long second){
		
		return first+second;
	}
	
	public long subFucn(long first,long second){
		
		return first-second;
	}
	
	public long mulFucn(long first,long second){
		
		return first*second;
	}
	 public float divFucn(float first,float second){

                return first/second;
       }
        public float avgFucn(float first,float second){

                return ((first+second)/2);
      }		
	public long modFucn(long first,long second){

                return first%second;
	
       }
        
	
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        int a1= Integer.parseInt(request.getParameter("n1"));
        int a2= Integer.parseInt(request.getParameter("n2"));
        
        
        
        if(request.getParameter("r1")!=null)
        {
            out.println("<h1>Addition</h1>"+addFucn(a1, a2));
        }
        if(request.getParameter("r2")!=null)
        {
            out.println("<h1>Substraction</h1>"+subFucn(a1, a2));
        }
        if(request.getParameter("r3")!=null)
        {
            out.println("<h1>Multiplication</h1>"+mulFucn(a1, a2));
        }
	if(request.getParameter("r4")!=null)
        {
            out.println("<h1>Divison</h1>"+divFucn(a1, a2));
        }
	if(request.getParameter("r5")!=null)
        {
            out.println("<h1>Average</h1>"+avgFucn(a1, a2));
        }
	if(request.getParameter("r6")!=null)
        {
            out.println("<h1>Modulus</h1>"+modFucn(a1, a2));
        }

	RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
        rd.include(request, response);  
        }
	catch(Exception e)
        {

        }
    }
}
