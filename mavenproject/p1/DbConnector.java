package com.mavenproject.p1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnector {
     
	
	public static Connection conn = null;
	public static Connection getConnection() throws Exception{
	    if(conn==null) {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root@39");
	    
	     
	    }
	    
		return conn;
	};
}
