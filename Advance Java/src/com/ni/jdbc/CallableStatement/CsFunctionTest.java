package com.ni.jdbc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import oracle.jdbc.internal.OracleTypes;

/*
  1  create or replace function fx_get_student_details
  2  (
  3  no in number,
  4  name out varchar2,
  5  addr out varchar2
  6  ) return float
  7  as percentage float;
  8  begin
  9  select sname,sadd,sadd into name,addr,percentage from student where sid=no;
 10  return percentage;
 11* end;
 */


public class CsFunctionTest 
{
	private static final String CS_PROCEDURE_QUERY="{?=call fx_get_student_details(?,?,?)}";
	public static void main(String[] args) 
	{
		//READ INPUT
		try(Scanner sc=new Scanner(System.in);)
		{
			int initial=0;
			if(sc!=null)
			{
				System.out.println("enter  no::");
				initial=sc.nextInt();
				
			}
			try(//established connection
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
				// create callable statement
					CallableStatement cs=con.prepareCall(CS_PROCEDURE_QUERY);)
			{
				//register OUT parems with jdbc database
					if(cs!=null)
					{
						cs.registerOutParameter(1,Types.FLOAT);
						cs.registerOutParameter(3, Types.VARCHAR);
						cs.registerOutParameter(4, Types.VARCHAR);
					}
				//set values to IN params
					if(cs!=null)
					{
						cs.setInt(2, initial);
					}
				//execute/call pl/sql procedure
					if(cs!=null)
					{
						cs.execute();
					}
				//gather the result of OUT params
					if(cs!=null) 
					{
						System.out.println("The output is::");	
						String name=cs.getString(3);
						String addr=cs.getString(4);
						float percentage=cs.getFloat(1);
						System.out.println("name::"+name+"addr::"+addr+"percentage::"+percentage);
					}
			}//try2
		}//try1
		catch(SQLException se)
		{
			se.printStackTrace();
			System.out.println("records are not found");
		}
	}
}
