package org.imyy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.SingleThreadModel;

public class HelloServlet1 extends GenericServlet implements SingleThreadModel{
	 private String username=null;  //usernameΪʵ������

	@Override
	 /** ��Ӧ�ͻ�����*/
	  public void service(ServletRequest request,ServletResponse response)
	    throws ServletException, IOException {
	    
	    //��username���������ֵ��usernameʵ������ 
	    username=request.getParameter("username");
	    
	    /*�ַ�����ת�� */
	    if(username!=null)
	      username=new String(username.getBytes("ISO-8859-1"),"GB2312");
	    
	    try{
	      Thread.sleep(3000); //�����ӳ���Ӧ�ͻ������ʱ��
	    }catch(Exception e){e.printStackTrace();}
	      
	    //����HTTP��Ӧ�����ĵ�MIME���ͼ��ַ�����
	    response.setContentType("text/html;charset=GB2312");
	   
	    /*���HTML�ĵ�*/
	    PrintWriter out = response.getWriter();
	    out.println("<html><head><title>HelloServlet</TITLE></head>");
	    out.println("<body>");
	    out.println("���: "+username);
	    out.println("</body></html>");
	     
	    out.close(); //�ر�PrintWriter
	   }

}
