package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdk.jshell.spi.ExecutionControl.ExecutionControlException;

//Login Application
public class PsLoginApp 
{
	private static final String LOGIN_QUERY="SELECT COUNT(*) FROM IRCTC WHERE UNAME=? AND PWD=?";
	public static void main(String[] args) 
	{
		//read Input
		Scanner sc=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
			sc=new Scanner(System.in);
			String uName=null,pwd=null;
			if(sc!=null)
			{
				System.out.println("Enter your Username");
				uName=sc.nextLine();
				System.out.println("Enter your Password");
				pwd=sc.nextLine();
			}
			
		//connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##gokate","oracle");
			
		//prepareStatement
			if(con!=null)
			{
				ps=con.prepareStatement(LOGIN_QUERY);
			}
			
		//set 
			if(ps!=null)
			{
				ps.setString(1, uName);
				ps.setString(2, pwd);
			}
		
		//execute
			if(ps!=null)
			{
				rs=ps.executeQuery();
			}
			
		//process
			int count=0;
			if(rs!=null)
			{
				rs.next();
				count=rs.getInt(1);
			}
			if(count==0)
			{
				System.out.println("Invalid Credentials");
			}
			else
			{
				System.out.println("valid Credentials");
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
				if(ps!=null)
					ps.close();
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
