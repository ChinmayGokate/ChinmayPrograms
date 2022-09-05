package com.ni.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//write a jdbc app to modify student name,avg,address based on given student no.(sno)
//update student set name='',avg=80.0,sadd='' where sno=1;
public class UpdateTest1 
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
			String sName=null;
			String sAdd=null;
			float sAvg=0.0f;
			int sno=0;
			if(sc!=null)
			{
			System.out.println("Enter new student name::");
			sName=sc.nextLine().toUpperCase();
			System.out.println("Enter new student avg ::");
			sAvg=sc.nextFloat();
			//sAvg=Float.parseFloat(sc.nextLine());
			System.out.println("Enter new student address::");
			sc.nextLine();
			sAdd=sc.nextLine().toUpperCase();
			System.out.println("Enter student number::");
			sno=sc.nextInt();
			
			}
			sName="'"+sName+"'";
			sAdd="'"+sAdd+"'";
			
			//Connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
			//createStatement
			if(con!=null)
				st=con.createStatement();
			
			//prepare query
			//update student set sname='vaibhav',sadd='khamgaon',savg=94.80 where sid=1
			String query="update student set sname="+sName+",sadd="+sAdd+",savg="+sAvg+" where sid="+sno;
			System.out.println(query);
			//execute sql query
			int count=0;
			if(st!=null) 
				count=st.executeUpdate(query);
			
			//process
			if(count==0)
				System.out.println("no records Found");
			else
				System.out.println("no. of records affected: "+count);
		}
		catch(SQLException se)
		{
			if(se.getErrorCode()>=900 && se.getErrorCode()<=999)
			{
				System.out.println("INvalid col name or table name or sql keyword");
			}
			else if(se.getErrorCode()==12899)
			{
				System.out.println("Do not insert more than col size to sname,sadd col");
			}
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
	//Assignment 1::
	//write a jdbc app to hike emp salary bt given percentage for the employees whose salary is inthe given range
	//(strat range to end range) (total 3 inputs from user)
	//===> UPDATE EMP SET SAL=SAL*10/100 WHERE SAL>=1000 AND SAL<=3000;
	//===> UPDATE EMP SET SAL=SAL*10/100 WHERE SAL BETWEEN 1000 AND 3000;
	
	//Assignment 2::
		//write a jdbc app to add the given percentage of marks to existing avg based on the given 3 city name 
		//as a address of a student (total 4 input)
		//===>update student set savg=savg+savg*10/100 where sadd IN('AKOLA','PUNE','BULDHANA');
		
	
	
}
