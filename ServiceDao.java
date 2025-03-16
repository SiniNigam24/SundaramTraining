//package com.service;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.util.List;
//import java.util.Scanner;
//
//import com.connection.DaoClass;
//import com.model.Student;
//
//public class ServiceDao {
//
//	public static void insertStudentRecords(List<Student> s) {
//		
//		try {
////			
//	Connection con=	DaoClass.getConnection();	
//		
//	String sql="create table emp1 (id int, name varchar(50),dob date)";
//	String sql1="insert into emp1 values(?,?)";
//	PreparedStatement ps=con.prepareStatement(sql);
//
//
////ps.setInt(1, );
////ps.setString(2,s2);
//	
//	
////for(Student i:s) {
////	ps.setInt(1,i.getId() );
////	ps.setString(2,i.getName());
////	ps.execute();
////	
////}
//boolean p=ps.execute(sql);
//System.out.println(p);
//
//int d1=ps.executeUpdate();
//if(d1>0)
//{	System.out.println("");
//}
//	}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//
//}
//}
//
//		
//		
////		
////		
////	}
////	
////	
////	
////	
////}


//import com.model.Student;
//import java.sql.*;
//import java.sql.Date;
//import java.time.LocalDate;
//public class ServiceDao {
//public void insertRecords(List<Student> l)
//{try {
//	Connection con=DBConnection.getConnection();
//	String sql="insert into student values(?,?,?)";
//	PreparedStatement ps=con.prepareStatement(sql);
//	int i=0;
//	for(Student s:l)
//	{
//		ps.setInt(1,s.getId());
//		ps.setString(2, s.getName());
//		ps.setDate(3, Date.valueOf(s.getDob()));
//		// i=ps.executeUpdate();
//		
//		//i++;
//		ps.addBatch();
//	}
//	
//	ps.executeBatch();
//}
//catch(Exception e)
//{
//	System.out.println(e);
//}
//}
//public void  getAllstudents()
//{
//	List<Student> l=new ArrayList();
//	{
//		try {
//			Connection con=DBConnection.getConnection();
//			Statement st=con.createStatement();
//		ResultSet rs=	st.executeQuery("select * from student");
//			while(rs.next())
//				{
//				int id=rs.getInt(1);
//				String name=rs.getString(2);
//				java.sql.Date d=rs.getDate(3);
//				LocalDate d1=d.toLocalDate();
//				Student s=new Student(id,name,d1);
//				l.add(s);
//				}
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		for(Student s1:l)
//		{
//			System.out.println(s1);
//		}
//	}
//}
//
//
//
//}
//
//
//
//
//
//import com.model.Student;
//import java.sql.*;
//import java.sql.Date;
//import java.time.LocalDate;
//public class ServiceDao {
//public void insertRecords(List<Student> l)
//{try {
//	Connection con=DBConnection.getConnection();
//	String sql="insert into student values(?,?,?)";
//	PreparedStatement ps=con.prepareStatement(sql);
//	int i=0;
//	for(Student s:l)
//	{
//		ps.setInt(1,s.getId());
//		ps.setString(2, s.getName());
//		ps.setDate(3, Date.valueOf(s.getDob()));
//		// i=ps.executeUpdate();
//		
//		//i++;
//		ps.addBatch();
//	}
//	
//	ps.executeBatch();
//}
//catch(Exception e)
//{
//	System.out.println(e);
//}
//}
//public void  getAllstudents()
//{
//	List<Student> l=new ArrayList();
//	{
//		try {
//			Connection con=DBConnection.getConnection();
//			Statement st=con.createStatement();
//		ResultSet rs=	st.executeQuery("select * from student");
//			while(rs.next())
//				{
//				int id=rs.getInt(1);
//				String name=rs.getString(2);
//				java.sql.Date d=rs.getDate(3);
//				LocalDate d1=d.toLocalDate();
//				Student s=new Student(id,name,d1);
//				l.add(s);
//				}
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		for(Student s1:l)
//		{
//			System.out.println(s1);
//		}
//	}
//}
//
//
//
//}






//--------------------


package com.service;
import java.util.*;

import com.connection.DBConnection;
import com.model.Student;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
public class ServiceDao {
public void insertRecords(List<Student> l)
{try {
	Connection con=DBConnection.getConnection();
	String sql="insert into student values(?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	int i=0;
	for(Student s:l)
	{
		ps.setInt(1,s.getId());
		ps.setString(2, s.getName());
		ps.setDate(3, Date.valueOf(s.getDob()));
		// i=ps.executeUpdate();
		
		//i++;
		ps.addBatch();
	}
	
	ps.executeBatch();
}
catch(Exception e)
{
	System.out.println(e);
}
}
//public void  getAllstudents()
//{
//	List<Student> l=new ArrayList();
//	{
//		try {
//			Connection con=DBConnection.getConnection();
//			Statement st=con.createStatement();
//		boolean rs=	st.execute(" ");
////			while(rs.next())
////				{
////				int id=rs.getInt(1);
////				String name=rs.getString(2);
////				java.sql.Date d=rs.getDate(3);
////				LocalDate d1=d.toLocalDate();
////				Student s=new Student(id,name,d1);
////				l.add(s);
////				}
////		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		for(Student s1:l)
//		{
//			System.out.println(s1);
//		}
//	}
//}


}






