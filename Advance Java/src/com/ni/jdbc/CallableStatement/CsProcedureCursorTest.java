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
  1  create or replace procedure p_sys_refcursor
  2  (
  3  inicial_char in number,
  4  details out sys_refcursor
  5  )
  6  as
  7  begin
  8  open details for
  9  select sid,sname,sadd,savg from student where sid=inicial_char;
 10  end;
 */


public class CsProcedureCursorTest 
{
	private static final String CS_PROCEDURE_QUERY="{CALL p_sys_refcursor(?,?)}";
	public static void main(String[] args) 
	{
		//READ INPUT
		try(Scanner sc=new Scanner(System.in);)
		{
			int initial=0;
			if(sc!=null)
			{
				System.out.println("enter no::");
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
						cs.registerOutParameter(2, OracleTypes.CURSOR);
					}
				//set values to IN params
					if(cs!=null)
					{
						cs.setInt(1, initial);
					}
				//execute/call pl/sql procedure
					if(cs!=null)
					{
						cs.execute();
					}
				//gather the result of OUT params
					if(cs!=null) 
					{
						ResultSet rs=(ResultSet)cs.getObject(2);
						System.out.println("The output is::");
						
							boolean flag=false;
							while(rs.next())
							{
							flag=true;
							System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
							}
							if(flag==false)
							{
								System.out.println("records are not found");
							}
						
					}
			}//try2
		}//try1
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
