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
		
		pw.println("<br>EmployeeName\t:"+request.getParameter("Name"));
		pw.println("<br>Basic Salary\t:\tRs."+(float)salary);
		pw.println("<br>Bonus\t\t:\tRs."+bonus);
		pw.println("<br>Tax\t\t:\tRs."+tax);
		pw.println("<br>Net\t\t:\tRs."+net);
		
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
