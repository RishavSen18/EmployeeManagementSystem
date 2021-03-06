package com.wipro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.Employee;
import com.wipro.EmployeeDAO;


public class AddServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Employee e=new Employee();
		e.setName(request.getParameter("name"));
		e.setGender(request.getParameter("gender"));
		e.setDesignation(request.getParameter("designation"));
		e.setSalary(Double.valueOf(request.getParameter("salary")));
		e.setCity(request.getParameter("city"));
		e.setEmail(request.getParameter("email"));
		e.setMobile(request.getParameter("mobile"));
		
		EmployeeDAO dao=new EmployeeDAO();
		dao.addEmployee(e);
		
//		PrintWriter out=response.getWriter();
//		response.setContentType("text/html");
//		out.println("<script type='text/javascript'>");
//		out.println("alert('data inserted')");
//		out.println("</script>");
		response.sendRedirect("index.jsp");
		
	}

}
