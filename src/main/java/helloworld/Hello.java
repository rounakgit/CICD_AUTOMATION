package helloworld;


import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;


@SuppressWarnings("serial")
public class Hello extends HttpServlet {
  public void doGet (HttpServletRequest req,
                     HttpServletResponse res)
    throws ServletException, IOException
  {
    PrintWriter out = res.getWriter();

    out.println("Hi anjan!");
    out.close();
  }
}

/*public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Automation Build and deployment!" );
	}

}*/
