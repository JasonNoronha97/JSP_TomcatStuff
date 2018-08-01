package com.Deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesDemo
 */
@WebServlet("/CookiesDemo")
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CookiesDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie allCookie[] = request.getCookies();
		PrintWriter pw = response.getWriter();
		
		if (allCookie == null) 
		{
			Cookie c = new Cookie("location", "Bangalore");
			c.setMaxAge(2 * 60 * 60);
			response.addCookie(c);
			pw.println("<body bgcolor=pink>First Time... </body>");
		} 
		else 
		{
			for (int i = 0; i < allCookie.length; i++) {
				Cookie c = allCookie[i];

				System.out.println(c.getName() + c.getValue());
				if (c.getName().equals("location") && c.getValue().equals("Bangalore")) {
					pw.println("<body bgcolor=green>2ndtime</body>");
				}
			}
		}
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
