package org.imyy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4066416548807093913L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		OutputStream out;
		InputStream in;
		String filename = req.getParameter("filename");
		if(filename==null){
			out = resp.getOutputStream();
			out.write("Please input filename!".getBytes());
			out.close();
			return;
		}
		in = getServletContext().getResourceAsStream("/store/"+filename);
		int length = in.available();
		resp.setContentType("application/force-download");
		resp.setHeader("Content-Length", String.valueOf(length));
		resp.setHeader("Content-Disposition", "attachment;filename=\""+filename+"\"");
		out=resp.getOutputStream();
		int bytesRead = 0;
		byte[] buffer = new byte[512];
		while((bytesRead = in.read(buffer))!=-1){
			out.write(buffer,0,bytesRead);
		}
		in.close();
		out.close();
	}

	

}
