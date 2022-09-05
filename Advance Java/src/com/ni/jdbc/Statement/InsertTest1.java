package com.ni.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//write a jdbc app to insert the records into student database table collecting input from enduser;
//INSERT INTO STUDENT VALUES(SID,SNAME,SADD,SAVG);
public class InsertTest1 
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
			int sId=0;
			String sName=null;
			String sAdd=null;
			float sAvg=0.0f;
			if(sc!=null)
			{
				System.out.println("Enter student number::");
				sId=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter student name::");
				sName=sc.nextLine().toUpperCase();
				System.out.println("Enter new student address::");
				
				sAdd=sc.nextLine().toUpperCase();
				System.out.println("Enter student avg ::");
				sAvg=sc.nextFloat();	
			
			}
			sName="'"+sName+"'";
			sAdd="'"+sAdd+"'";
			
			//Connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
			//createStatement
			if(con!=null)
				st=con.createStatement();
			
			//prepare query
			//insert int student values(6,'anil','mumbai',89);
			String query="INSERT INTO STUDENT VALUES("+sId+","+sName+","+sAdd+","+sAvg+")";
			System.out.println(query);
			//execute sql query
			int count=0;
			if(st!=null) 
				count=st.executeUpdate(query);
			
			//process
			if(count==0)
				System.out.println("no records inserted");
			else
				System.out.println("Record inserted: "+count);
		}
		catch(SQLException se)
		{
			if(se.getErrorCode()==1)
			{
				System.out.println("Duplicate can not inserted into PK column");
			}
			if(se.getErrorCode()==1400)
			{
				System.out.println("NULL can not inserted into PK column");
			}
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
	

}
