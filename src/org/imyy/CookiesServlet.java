package org.imyy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesServlet extends HttpServlet {
	int c = 0;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Cookie theCookie = new Cookie("username","Kvkens" + c);
		c++;
		theCookie.setMaxAge(3600*3600);
		resp.addCookie(theCookie);
		Cookie cookies[] = req.getCookies();
		if(cookies!=null){
			for (int i = 0; i < cookies.length; i++) {
				System.out.println("Cookie Name:" + cookies[i].getName() + "---"+"Cookie Value:"+cookies[i].getValue()+"---Max:"+cookies[i].getMaxAge());
			}
		}else{
			System.out.println("NULL");
		}

	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
		System.out.println("init ok!");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4056304755986324258L;

}
