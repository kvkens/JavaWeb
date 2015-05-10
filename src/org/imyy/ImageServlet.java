/**
 * 
 */
package org.imyy;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 * @author Kvkens
 *
 */
public class ImageServlet extends HttpServlet {

	private Font font = new Font("Microsoft Yahei",Font.BOLD,12);
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String count = req.getParameter("count");
		if(count==null)count="1";
		int len = count.length();
		
		resp.setContentType("image/jpeg");
		ServletOutputStream out = resp.getOutputStream();
		BufferedImage image = new BufferedImage(11*len, 16,BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, 11*len, 16);
		g.setColor(Color.white);
		g.setFont(font);
		
		char c;
		for (int i = 0; i < len; i++) {
			c = count.charAt(i);
			g.drawString(c+"", i*11+1, 12);
			g.drawLine((i+1)*11-1, 0, (i+1)*11-1, 16);			
		}
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		encoder.encode(image);
		out.close();
		
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2120136749635573674L;

}
