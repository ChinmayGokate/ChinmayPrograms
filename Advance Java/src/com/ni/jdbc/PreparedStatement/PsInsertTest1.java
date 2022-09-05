package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//write a jdbc app to insert the multiple customer details to the customer table
public class PsInsertTest1 
{
	private static final String INSERTQUERY="INSERT INTO CUSTOMER VALUES(?,?,?,?)";
	public static void main(String[] args) 
	{
		//read input
		Scanner sc=null;
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			sc=new Scanner(System.in);
			int count=0;
			if(sc!=null)
			{
				System.out.println("Enter the count (how many customer detais you want to insert::");
				count=sc.nextInt();
			}
		// establish connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
		//prepareStatement
		if(con!=null)
			ps=con.prepareStatement(INSERTQUERY);
		//read Input,set query,execute pre-compile sql query,process
		if(ps!=null && sc!=null)
		{
			for(int i=1;i<=count;i++)
			{
			//read Each customer input
				System.out.println("Enter "+i+"th Customer Details");
				System.out.println("Enter Customer Id");
				int cusId=sc.nextInt();
				System.out.println("Enter Customer Name");
				sc.nextLine();
				String cusName=sc.nextLine().toUpperCase();
				System.out.println("Enter Customer Address");
				String cusAdd=sc.nextLine().toUpperCase();
				System.out.println("Enter Customer Age");
				int cusAge=sc.nextInt();
				
			//Set Query
				ps.setInt(1, cusId);
				ps.setString(2, cusName);
				ps.setString(3, cusAdd);
				ps.setInt(4, cusAge);
				
			//execute
				int result=ps.executeUpdate();
				
			//process
				if(result==0)
				{
					System.out.println("Customer Details Not Inserted");
				}
				else
				{
					System.out.println("Customer Details are Inserted");
				}//if
			}//for
		}//if
		}//try
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
					ps.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
