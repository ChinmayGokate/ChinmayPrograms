package com.ni.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Write a jdbc app to delete student records based on given cityname(sadd)
//delete from student where sadd='akola'
public class DeleteTest1 
{
	public static void main(String[] args) 
	{
		Scanner sc=null;
		Connection con=null;
		Statement st=null;
		try
		{
			//read Input
			sc=new Scanner(System.in);
			String cityName=null;
			if(sc!=null)
			{
			System.out.println("Enter student address(city name)::");
			cityName=sc.next().toUpperCase();
			}
			cityName="'"+cityName+"'";
			
			//Connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
			//createStatement
			st=con.createStatement();
			
			//prepare query
			String query="DELETE FROM STUDENT WHERE SADD="+cityName;
			System.out.println(query);
			//execute sql query
			int count=0;
			if(st!=null)
				count=st.executeUpdate(query);
			
			//process
			if(count==0)
				System.out.println("No Records found to delete");
			else
				System.out.println("no. of records that are affected:"+count);
		}
		catch(SQLException se)
		{
			if(se.getErrorCode()>=900 && se.getErrorCode()<=999)
				System.out.println("Invalid col name or table name or SQL keyword");
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
