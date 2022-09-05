package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PsUpdateTest 
{
	private static final String UPDATEQUERY="UPDATE STUDENT SET SID=? WHERE SNAME=?";
	public static void main(String[] args) 
	{
	//READ INPUT
		Scanner sc=null;
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			sc=new Scanner(System.in);
			int sid=0;
			String sname=null;
			if(sc!=null)
			{
			System.out.println("Enter student Id to set");
			sid=sc.nextInt();
			System.out.println("Enter student name you have to update");
			sc.nextLine();
			sname=sc.nextLine();
			}
		// Connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
		
		//create prepareStatement obj to make sql query to pre-compile sql query and
		//this obj having pre-compile sql query
			if(con!=null)
				ps=con.prepareStatement(UPDATEQUERY);
			
		//set the query parameter value and 
			if(ps!=null)
			{
				ps.setInt(1, sid);
				ps.setString(2, sname);
			}
		//execute the pre-compile sql query			
			int count=0; 
			if(ps!=null)
				count=ps.executeUpdate();
			
			if(count==0)
			{
				System.out.println("not success");
			}
			else
			{
				System.out.println("success");
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
				ps.close();
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
