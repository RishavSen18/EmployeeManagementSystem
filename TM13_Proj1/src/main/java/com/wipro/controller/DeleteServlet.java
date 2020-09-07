package com.wipro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.EmployeeDAO;

public class DeleteServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		int id=(int)session.getAttribute("id");
		EmployeeDAO dao=new EmployeeDAO();
		dao.deleteEmployee(id);
		session.removeAttribute("id");
		response.sendRedirect("index.jsp");
	}

}
