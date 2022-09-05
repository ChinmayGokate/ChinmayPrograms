package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PsDeleteTest 
{
	private static final String DELETEQUERY="DELETE FROM STUDENT WHERE SID=?";
	public static void main(String[] args) 
	{
		Scanner sc=null;
		Connection con=null;
		PreparedStatement ps=null;
		//read input
		try
		{
			sc=new Scanner(System.in);
			int sDelete=0;
			if(sc!=null)
			{
				System.out.println("Enter student Id for delete student");
				sDelete=sc.nextInt();
			}
			
		//Connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##gokate","oracle");
			
		//prepare statement to make over sql query to pricompile sql query
			if(con!=null)
			{
				ps=con.prepareStatement(DELETEQUERY);
			}
			
		// set sql pricompile query
			if(ps!=null)
			{
				ps.setInt(1,sDelete);
			}
		//execute sql pricompiled query
			int count=0;
			if(ps!=null)
			{
				count=ps.executeUpdate();
			}
		//process
			if(count==0)
			{
				System.out.println("student not deleted");
			}
			else
			{
				System.out.println("student deleted successfully");
			}
		}
		catch (SQLException se) 
		{
			se.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
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
