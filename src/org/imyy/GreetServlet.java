package org.imyy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 /*Êä³öHTMLÎÄµµ*/
	    PrintWriter out = response.getWriter();
	    out.println("Hi,"+request.getParameter("username")+"<p>");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1812071226540904069L;
	

}
