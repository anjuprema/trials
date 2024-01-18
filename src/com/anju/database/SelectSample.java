package com.anju.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Exception in thread "main" java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
		//Download jdbc driver from https://dev.mysql.com/downloads/connector/j/
		//Extract zip
		//Add to class path
		//Right click on project >> Build Path >> Add External Archives
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/life_meds","UserAnju","123456789");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from product_category");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
	}

}
