package org.imyy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class OutputServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2694400806454316409L;

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message = (String) req.getAttribute("msg");
		PrintWriter out = res.getWriter();
		out.println(message);
		out.close();
	}
}
