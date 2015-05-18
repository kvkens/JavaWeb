package org.imyy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //����HTTP��Ӧ�����ĵ���������
	    response.setContentType("text/html");
	    
	    /*���HTML�ĵ�*/
	    PrintWriter out = response.getWriter();
	    out.println("<html><head><title>MainServlet</TITLE></head>");
	    out.println("<body>");

	    ServletContext context = getServletContext();
	    RequestDispatcher headDispatcher =context.getRequestDispatcher("/20150518/header.htm");  
	    RequestDispatcher greetDispatcher =context.getRequestDispatcher("/greet");  
	    RequestDispatcher footerDispatcher =context.getRequestDispatcher("/20150518/footer.htm");  
	    
	    //����header.htm   
	    headDispatcher.include(request,response);
	    //����GreetServlet�����HTML�ĵ�
	    greetDispatcher.include(request,response);
	    //����footer.htm
	    footerDispatcher.include(request,response);

	    out.println("</body></html>");

	    //�ر������
	    out.close();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2957473002975875068L;

	
}
