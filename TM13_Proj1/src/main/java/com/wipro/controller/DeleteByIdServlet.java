package com.wipro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.Employee;
import com.wipro.EmployeeDAO;

public class DeleteByIdServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id=Integer.valueOf(request.getParameter("id"));
		EmployeeDAO dao=new EmployeeDAO();
		Employee e = dao.showEmployee(id);
		request.setAttribute("e", e);
		
		RequestDispatcher rd=request.getRequestDispatcher("deleteEmployeeById.jsp");
		rd.forward(request, response);
	}

}
