package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SurrogatePkTest 
{
	private static final String INSERTQUERY="INSERT INTO STUDENT VALUES(SEQ1.NEXTVAL,?,?,?)";
	public static void main(String[] args) 
	{
		Scanner sc=null;
		Connection con=null;
		PreparedStatement ps=null;
		
		//read data (count)
		try
		{
			sc=new Scanner(System.in);
			int count=0;
			if(sc!=null)
			{
				System.out.println("enter Count");
				count=sc.nextInt();
			}
		//connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
		//prepareStatement to make sql query to pricompile sql query
			if(con!=null)
			{
				ps=con.prepareStatement(INSERTQUERY);
			}
			
			for(int i=1;i<=count;i++)
			{
			//read input
				System.out.println("enter "+i+" student details");
				System.out.println("Enter student name");
				sc.nextLine();
				String sName=sc.nextLine().toUpperCase();
				System.out.println("Enter student add");
				String sAdd=sc.nextLine().toUpperCase();
				System.out.println("Enter student marks avg");
				float sAvg=sc.nextFloat();
				
			if(ps!=null)
			{
			  //set
				ps.setString(1, sName);
				ps.setString(2, sAdd);
				ps.setFloat(3, sAvg);
				
		      //execute
				 int result=ps.executeUpdate();
				
			  //process
				if(result==0)
				{
					System.out.println("not interted");
				}
				else
				{
					System.out.println("inserted no. of query is :"+result);
				}
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
