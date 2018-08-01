package com.deloitte;

import java.sql.*;
import java.util.ArrayList;

public class DBHelper {

	public ArrayList getAllPassengers(String destParam) {
		ArrayList al = new ArrayList();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			String sqlQuery = "SELECT * FROM PASSENGERS WHERE DESTINATION=?";
			PreparedStatement psmt = con.prepareStatement(sqlQuery);
			
			psmt.setString(1, destParam);

			ResultSet rs = psmt.executeQuery();

			// Convert rs to ArrayList

			while (rs.next()) {
				String fName = rs.getString(1);
				String lName = rs.getString(2);
				String source = rs.getString(3);
				String dest = rs.getString(4);
				String gender = rs.getString(5);

				// make each row into object

				Passenger p = new Passenger();
				p.setfName(fName);
				p.setlName(lName);
				p.setSource(source);
				p.setDestination(dest);
				p.setGender(gender);

				// create obj for each row ^
				al.add(p);
			}
			//TRY BLOCK
			
			rs.close();
			psmt.close();
			con.close();
			
		} catch (ClassNotFoundException c) {
			System.out.println(c.getMessage()+"CLASS");
		} catch (SQLException c) {
			System.out.println(c.getMessage()+"SQL");
		}
		return al;
	}

}
