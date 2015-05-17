package org.imyy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CheckServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8578635571042920543L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String message = null;
		if(username==null){
			message = "please input name";
		}else{
			message = "Hello,"+username;
		}
		req.setAttribute("msg", message);
		
		ServletContext context = getServletContext();
		RequestDispatcher displatcher = context.getRequestDispatcher("/output");
		PrintWriter out = res.getWriter();
		out.println("Output from CheckServlet before forwarding request");
		System.out.println("Output from CheckServlet before forwading request");
		displatcher.forward(req, res);
		out.println("Output from CheckServlet after forwarding request");
		System.out.println("Output from CheckServlet after forwading request");
	}
}
