package com.wipro.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.Employee;
import com.wipro.EmployeeDAO;

public class ShowAllServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		EmployeeDAO dao=new EmployeeDAO();
		List<Employee> list=dao.showAllEmployee();
		request.setAttribute("list", list);
//		list.stream().forEach(System.out::println);
		RequestDispatcher rd=request.getRequestDispatcher("AllEmployee.jsp");
		rd.forward(request, response);
	}

}
