package org.imyy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3143788555259704385L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		PrintWriter out = resp.getWriter();
		resp.addHeader("Pragma", "no-cache");
		resp.setHeader("Cache-Control","no-cache");
		resp.setHeader("Expires", "0");
		out.println("{\"username\":\""+username+"\"}");
		System.out.println("username:\""+username+"\"");
		String color = getInitParameter("color");
		System.out.println(req.getRemoteAddr() + req.getServerName());
	}
}
