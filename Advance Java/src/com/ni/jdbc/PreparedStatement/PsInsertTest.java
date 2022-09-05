package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//write a jdbc app to insert "n" student detail to Student DB table
//by collection details from endusers
//====> private/public static final string insertQuery="insert into student values(?,?,?,?);"
public class PsInsertTest 
{
	//recommended to write top of the class
	private static final String INSERTQUERY="INSERT INTO STUDENT VALUES(?,?,?,?)";
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
				System.out.println("enter student count(how many studends input you have to insert)::");
				count=sc.nextInt();
			}
		//register jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
 
		//establish connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
		//create prepareStatement obj to make sql query to pre-compile sql query and this obj having pre-compile sql query 
		if(con!=null)
			ps=con.prepareStatement(INSERTQUERY);
		
		//read input from enduser and set them to query parameter value and execute the pre-compile sql query for multiple time
		if(ps!=null && sc!=null)
		{
			for(int i=1;i<=count;i++)
			{
			// read each student input value
				System.out.println("Enter "+i+"student Datails");
				System.out.println("Enter student ID");
				int sId=sc.nextInt();
				System.out.println("Enter student Name");
				sc.nextLine();
				String sName=sc.nextLine().toUpperCase();
				System.out.println("Enter student Address");
				String sAdd=sc.nextLine().toUpperCase();
				System.out.println("Enter student Avg");
				float sAvg=sc.nextFloat();
				
			//set each student detains as per pre-compile sql query
				ps.setInt(1, sId);
				ps.setString(2, sName);
				ps.setString(3,sAdd);
				ps.setFloat(4, sAvg);
			
			//execute pre-compile sql query each time
				int result=ps.executeUpdate();
				
			//process execution results of pre-compie sql query
				if(result==0)
				{
					System.out.println("Student detains not Inserted");
				}
				else
				{
					System.out.println("Student details are Inserted");
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
					sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}//main
}//class
