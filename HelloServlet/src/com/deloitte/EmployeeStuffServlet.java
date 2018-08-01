package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeStuffServlet
 */
@WebServlet("/EmployeeStuffServlet")
public class EmployeeStuffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeStuffServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = response.getWriter();

		int salary = Integer.parseInt(request.getParameter("Salary"));
		String grade = request.getParameter("Grade");

		double tax = 0.25*salary;
		double bonus=0;
		if(grade.toUpperCase().equals("A") && salary > 100000)
			bonus=0.05*salary;
		else if(grade.toUpperCase().equals("B") && salary > 50000 && salary<100000)
			bonus=0.07*salary;
		else if(grade.toUpperCase().equals("C") && salary < 50000 && salary>0)
			bonus=0.2*salary;
		
		double net = salary+bonus-tax;
		
		
		pw.println("<br>EmployeeName:"+request.getParameter("Name")+"</td></tr>");
		pw.println("<br>Basic Salary:Rs."+(float)salary+"</td></tr>");
		pw.println("<br>Bonus:Rs."+bonus+"</td></tr>");
		pw.println("<br>Tax:Rs."+tax+"</td></tr>");
		pw.println("<br>Net:Rs."+net+"</td></tr>");
		
		
		pw.println("<table border=\"2\">");
		pw.println("<tr><td>EmployeeName</td><td>:</td><td>"+request.getParameter("Name")+"</td></tr>");
		pw.println("<tr><td>Basic Salary</td><td>:</td><td>Rs."+(float)salary+"</td></tr>");
		pw.println("<tr><td>Bonus</td><td>:</td><td>Rs."+bonus+"</td></tr>");
		pw.println("<tr><td>Tax</td><td>:</td><td>Rs."+tax+"</td></tr>");
		pw.println("<tr><td>Net</td><td>:</td><td>Rs."+net+"</td></tr>");
		
//		response.getWriter().append("<br><br>Served at: ").append(request.getRealPath(arg0));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
