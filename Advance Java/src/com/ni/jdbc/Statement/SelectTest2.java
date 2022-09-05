package com.ni.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//write a app to gives depatment from dept table based on given deptno;
public class SelectTest2 
{
	public static void main(String args[])
	{
		Scanner sc=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			sc=new Scanner(System.in);
			int dno=0;
			if(sc!=null)
			{
				System.out.print("Enter Dept no :");
				dno=sc.nextInt();
			}
			
			//Load JDBC Class
			//Class.forName("jdbc:oracle:thin:@localhost:1521:orcl","C##gokate","oracle");
			
		//Connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##gokate","oracle");
			
		//create Statement
		if(con!=null)
			st=con.createStatement();
			
		//execute query
		if(st!=null)
			rs=st.executeQuery("SELECT DEPTNO,DNAME,LOC FROM DEPT WHERE DEPTNO ="+dno);
		//process (0 or 1 result)
		if(rs!=null)
		{
			if(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			else
			{
				System.out.println("No Records found");
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
				rs.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			try
			{
				st.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			try
			{
				con.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
