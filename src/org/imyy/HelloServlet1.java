package org.imyy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.SingleThreadModel;

public class HelloServlet1 extends GenericServlet implements SingleThreadModel{
	 private String username=null;  //username为实例变量

	@Override
	 /** 响应客户请求*/
	  public void service(ServletRequest request,ServletResponse response)
	    throws ServletException, IOException {
	    
	    //把username请求参数赋值给username实例变量 
	    username=request.getParameter("username");
	    
	    /*字符编码转换 */
	    if(username!=null)
	      username=new String(username.getBytes("ISO-8859-1"),"GB2312");
	    
	    try{
	      Thread.sleep(3000); //特意延长响应客户请求的时间
	    }catch(Exception e){e.printStackTrace();}
	      
	    //设置HTTP响应的正文的MIME类型及字符编码
	    response.setContentType("text/html;charset=GB2312");
	   
	    /*输出HTML文档*/
	    PrintWriter out = response.getWriter();
	    out.println("<html><head><title>HelloServlet</TITLE></head>");
	    out.println("<body>");
	    out.println("你好: "+username);
	    out.println("</body></html>");
	     
	    out.close(); //关闭PrintWriter
	   }

}
