package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Scanner;
	

	public class PsAgeCalculatorGereric  
	{
		private static final String SELECT_QUERY ="SELECT DOB FROM PERSON_INFO_DATES WHERE PID=?";
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
							java.sql.Date sqlDate=rs.getDate(1);
							System.out.println(sqlDate);
							java.util.Date utilDate= new java.util.Date();
							System.out.println(utilDate);//system date
							float age=utilDate.getTime()-sqlDate.getTime();
							float finalAge=age/(1000.0f*60.0f*60.0f*24.0f*365.25f);
							System.out.println(finalAge);
							//comvert decimal format
							DecimalFormat d=new DecimalFormat("#.##");
							String deciAge=d.format(finalAge);
							System.out.println(deciAge);
							
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































