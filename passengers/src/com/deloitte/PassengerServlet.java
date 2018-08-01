package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PassengerServlet
 */
@WebServlet("/PassengerServlet")
public class PassengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassengerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination = request.getParameter("dest");
			
		//Call JDBC Code here... //not supposed to write
		DBHelper db = new DBHelper();
		ArrayList passengersList = db.getAllPassengers(destination);
		//RETURNNG RESULTSET is NOT RECOMMENDED
		
		String str = 
				"<table border=1>"
					+ "<tr>"
						+ "<th>First Name</th>"
						+ "<th>Last Name</th>"
						+ "<th>Source</th>"
						+ "<th>Destination</th>"
						+ "<th>Gender</th>"
					+ "</tr>";
		
		PrintWriter pw = response.getWriter();
		
		pw.println(str);
		
		for (int i = 0; i < passengersList.size(); i++) {
			Passenger p = (Passenger)passengersList.get(i);
			String str2 = 
					"<tr>"
						+ "<td>"+ p.getfName()+"</td>"
						+ "<td>"+ p.getlName()+"</td>"
						+ "<td>"+ p.getSource()+"</td>"
						+ "<td>"+ p.getDestination()+"</td>"
						+ "<td>"+ p.getGender()+"</td>"
					+"</tr>";
			pw.println(str2);
		}
		pw.println("</table>");
		
		pw.println("<br>-------------------------------");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
