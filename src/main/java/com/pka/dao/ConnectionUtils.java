package com.pka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtils {

	public static Connection getConnection() throws Exception {
		String userName = "root";
		String password = "6617677a842bc99d79b3bbf3d8";
		String serverName = "139.59.229.170";
		String portNumber = "3306";
		
	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", userName);
	    connectionProps.put("password", password);

        conn = DriverManager.getConnection(
                   "jdbc:mysql://" +
                   serverName +
                   ":" + portNumber + "/",
                   connectionProps);
	        
	    System.out.println("Connected to database");
	    
	    return conn;
	}
}
