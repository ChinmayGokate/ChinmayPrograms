package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
	
/*Converting Sql date format to String date format*/
	public class PsAgeCalculator  
	{
		private static final String SELECT_QUERY ="SELECT ROUND((SYSDATE-DOB)/365.25,2) FROM PERSON_INFO_DATES WHERE PID=?";
		public static void main(String[] args) 
		{
			Scanner sc=null;
			Connection con= null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			try
			{
				sc=new Scanner(System.in);
				int pId=0;
				if(sc!=null)
				{
					System.out.println("Enter person ID");
					pId=sc.nextInt();
				}
			
				
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
				ps=con.prepareStatement(SELECT_QUERY);
				
				if(ps!=null)
				{
					ps.setInt(1, pId);
				
					rs=ps.executeQuery();
				}
				//process
				if(rs!=null)
				{
					boolean flag=false;
					if(rs.next())
						{
							flag=true;
							float age=rs.getFloat(1);
							System.out.println(age);
						}
					if(flag==false)
					{
						System.out.println("person not fount");
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
				try {
					rs.close();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
				try {
					ps.close();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
				try {
					con.close();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
				try {
					sc.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		}
	}






























