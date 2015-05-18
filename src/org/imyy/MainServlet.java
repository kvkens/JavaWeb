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
		 //设置HTTP响应的正文的数据类型
	    response.setContentType("text/html");
	    
	    /*输出HTML文档*/
	    PrintWriter out = response.getWriter();
	    out.println("<html><head><title>MainServlet</TITLE></head>");
	    out.println("<body>");

	    ServletContext context = getServletContext();
	    RequestDispatcher headDispatcher =context.getRequestDispatcher("/20150518/header.htm");  
	    RequestDispatcher greetDispatcher =context.getRequestDispatcher("/greet");  
	    RequestDispatcher footerDispatcher =context.getRequestDispatcher("/20150518/footer.htm");  
	    
	    //包含header.htm   
	    headDispatcher.include(request,response);
	    //包含GreetServlet输出的HTML文档
	    greetDispatcher.include(request,response);
	    //包含footer.htm
	    footerDispatcher.include(request,response);

	    out.println("</body></html>");

	    //关闭输出流
	    out.close();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2957473002975875068L;

	
}
