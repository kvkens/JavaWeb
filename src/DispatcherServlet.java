import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class DispatcherServlet extends GenericServlet {
	private String target = "/demo3.2/hello.jsp";

	/**
	 * 
	 */
	private static final long serialVersionUID = -5722848235246935200L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		request.setAttribute("USER", username);
		request.setAttribute("PASSWORD", password);
		System.out.println(password);
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(target);
		dispatcher.forward(request, response);
	}

}
