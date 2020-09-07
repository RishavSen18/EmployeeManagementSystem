package com.wipro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user=request.getParameter("user");
		String pass=request.getParameter("pwd");
		if(user.equals("risahv") && pass.equals("12345"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			session.setAttribute("pass", pass);
			response.sendRedirect("index.jsp");
		}
		else
			response.sendRedirect("login.jsp");
	}

}
