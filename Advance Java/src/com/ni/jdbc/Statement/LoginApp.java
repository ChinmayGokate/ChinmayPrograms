package com.ni.jdbc.Statement;
//Login Application
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginApp 
{
 public static void main(String[] args) 
 {
	//read input
	 Scanner sc=null;
	 Connection con=null;
	 Statement st=null;
	 ResultSet rs=null;
	try
	{
		sc=new Scanner(System.in);
		String uname=null,pwd=null;
		if(sc!=null)
		{
			System.out.println("enter your Username :");
			uname=sc.nextLine();
			System.out.println("enter your password :");
			pwd=sc.nextLine();
		}
	// converting
		uname="'"+uname+"'";
		pwd="'"+pwd+"'";
	//Load jdbc Driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
	//connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
		
	//createStatement
		if(con!=null)
		{
			st=con.createStatement();
		}
	//prepare sql query
		//SELECT COUNT(*) FROM IRCTC WHERE UNAME='CHINMAY' AND PWD='C1';
		String query="SELECT COUNT(*) FROM IRCTC WHERE UNAME="+uname+" AND PWD="+pwd;
		System.out.println(query);
	//send abd execute sql query 
		if(st!=null)
		{
			rs=st.executeQuery(query);
		}
	// process resultset obj
		if(rs!=null)
		{
			rs.next();
			int count=rs.getInt(1);
			//System.out.println(count);
	//process result
			if(count==0)
			{
				System.out.println("Invalid Credential");
			}
			else
			{
				System.out.println("valid Credential");
			}
		}
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			if(rs!=null)
				rs.close();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		try
		{
			if(st!=null)
				st.close();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		try
		{
			if(con!=null)
				con.close();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		try
		{
			if(sc!=null)
				sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
 }
}

//Output::
//		enter your Username :
//		chinmay
//		enter your password :
//		c1
//		SELECT COUNT(*) FROM IRCTC WHERE UNAME='chinmay' AND PWD='c1'
//		1
//		valid Credential
//		
//SQL Injection Problems
//		:- passing spacia sql instruction(like -- symbol) to the SQL query along with the input values
//			of the application and change the behavier od sql query and the Underlying app is called 
//			as injection problem.
//			
//		:- hackers and jacker are use this technique to hack the account without knowing username 
//			and password both
//			
//		case1:: 
//				enter your Username :
//				chinmay' --
//				enter your password :
//				hyderabad
//				SELECT COUNT(*) FROM IRCTC WHERE UNAME='chinmay' --' AND PWD='hyderabad'
//				1
//				valid Credential
//		case2::
//				enter your Username :
//				xyz' or 1=1 --
//				enter your password :
//				pune
//				SELECT COUNT(*) FROM IRCTC WHERE UNAME='xyz' or 1=1 --' AND PWD='pune'
//				4
//				valid Credential

					
	
