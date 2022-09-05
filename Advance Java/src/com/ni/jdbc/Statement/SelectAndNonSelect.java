package com.ni.jdbc.Statement;
/*we can use single method callon jdbc statement obj to send and execute
 * both setect and non select query in DB s/w (but one sql query at a time)
 * ans:: ye, it is possible by execude(-) mehtod
 * signiture 
 * 			public boolean execute(String query) throws SQLException
 * 
 * for select sql query ----rs.getResultSet() its return ResultSet obj
 * For Select non sql query --rs.getUpdateCount() its return int obj
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectAndNonSelect 
{
	public static void main(String[] args) 
	{
	//read input
	Scanner sc=null;
	String query=null;
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try 
	{
		sc=new Scanner(System.in);
		if(sc!=null)
		{
			System.out.println("Enter the select or non select sql query ");
			query=sc.nextLine();
		}//read input
		//load jdbc driver
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
		
		//CreateStatement
		if(con!=null)
		{
			st=con.createStatement();
		}
		//send and execute query
		if(st!=null)
		{
			boolean flag=st.execute(query);
			if(flag==true) 
			{
				System.out.println("Select SQL query executed ");
				rs=st.getResultSet();	
			//process
				if(rs!=null)
				{
					while(rs.next())
					{
						System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
					}
				}
				
			}
			else
			{
				System.out.println("Non Select SQL query executed ");
				int count=st.getUpdateCount();
			//process
				System.out.println("no. of record affected: "+count);
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
