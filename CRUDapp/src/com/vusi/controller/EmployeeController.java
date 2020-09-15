package com.vusi.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.vusi.dao.EmployeeDAO;
import com.vusi.dao.EmployeeDAOImpl;
import com.vusi.model.Employee;

public class EmployeeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher dispatcher = null;
	EmployeeDAO employeeDAO = null;
	
	public EmployeeController() {
		employeeDAO = new EmployeeDAOImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action == null) {
			action = "LIST";
		}
		
		switch(action) {
			
			case "LIST":
				listEmployee(request, response);
				break;
				
			case "EDIT":
				getSingleEmployee(request, response);
				break;
				
			case "DELETE":
				deleteEmployee(request, response);
				break;
				
			default:
				listEmployee(request, response);
				break;
				
		}
		
	}

	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("EmployeeID");
	
		if(employeeDAO.delete(Integer.parseInt(id))) {
			request.setAttribute("NOTIFICATION", "Employee Deleted Successfully!");
		}
		
		listEmployee(request, response);
	}

	private void getSingleEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String id = request.getParameter("EmployeeID");
		
		Employee theEmployee = employeeDAO.get(Integer.parseInt(id));
		
		request.setAttribute("employee", theEmployee);
		
		dispatcher = request.getRequestDispatcher("employee-form.jsp");
		
		dispatcher.forward(request, response);
	}

	private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Employee> theList = employeeDAO.get();
		
		request.setAttribute("list", theList);
		
		dispatcher = request.getRequestDispatcher("employee-list.jsp");
		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		Employee e = new Employee();
		e.setFull_Name(request.getParameter("Full_Name"));
		e.setTelephone_Number(request.getParameter("Telephone_Number"));
		e.setHome_Location(request.getParameter("Home_Location"));
		e.setBranch_Name(request.getParameter("Branch_Name"));
		e.setBranch_Location(request.getParameter("Branch_Location"));
		
		if(id.isEmpty() || id == null) {
			
			if(employeeDAO.save(e)) {
				request.setAttribute("NOTIFICATION", "Employee Saved Successfully!");
			}
		
		}else {
			
			e.setEmployeeID(Integer.parseInt(id));
			if(employeeDAO.update(e)) {
				request.setAttribute("NOTIFICATION", "Employee Updated Successfully!");
			}
			
		}
		
		listEmployee(request, response);
	}

}
