package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class PsDateInsertTest 
{
	private static final String INSERT_DATE ="INSERT INTO PERSON_INFO_DATES VALUES (SEQ1.NEXTVAL,?,?,?,?,?)";
	public static void main(String[] args) 
	{
		Scanner sc=null;
		Connection con= null;
		PreparedStatement ps=null;
		try
		{
			//read input
			sc=new Scanner(System.in);
			String pName=null,dob=null,dom=null,doj=null,add=null;
			if(sc!=null)
			{
				System.out.println("Enter name");
				pName=sc.nextLine();
				System.out.println("Enter date of birth dd-MM-yyyy");
				dob=sc.nextLine();
				System.out.println("enter date of job dd-MMM-yyyy");
				doj=sc.nextLine();
				System.out.println("enter date of marriage yyyy-MM-dd");
				dom=sc.nextLine();
				System.out.println("enter address");
				add=sc.nextLine();
			}
		//dob
			//Converting String date value to Util.date value
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date ud=sdf.parse(dob);
			
			//Converting Util.date value to sql.date value
			long ms=ud.getTime(); //return date and time in milliseconds
			java.sql.Date sd=new java.sql.Date(ms);
			
		//doj
			//convert string to util
			SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-yyyy");
			java.util.Date ud1=sdf1.parse(doj);
			//convert util to sql
			long ms1=ud1.getTime();
			java.sql.Date sd1=new java.sql.Date(ms1);
			
		//dom
			//convert string to util to sql direct for only yyyy-MM-dd date format
			java.sql.Date sd2=java.sql.Date.valueOf(dom);
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
		
			ps=con.prepareStatement(INSERT_DATE);
			
			ps.setString(1, pName);
			ps.setDate(2, sd);
			ps.setDate(3, sd1);
			ps.setDate(4, sd2);
			ps.setString(5, add);
			
			int count=ps.executeUpdate();
			if(count==0)
			{
				System.out.println("not inserted");
			}
			else
			{
				System.out.println("inserted");
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



























