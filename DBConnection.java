package com.connection;


	
	



import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
public static Connection getConnection()
{
	Connection con=null;

	try {
	Class.forName("oracle.jdbc.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SiniNigam");
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return con;
}}