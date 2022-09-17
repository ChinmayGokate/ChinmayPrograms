package com.ni.jdbc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

/*
  1  create or replace procedure p_get_student_details
  2  (
  3  sno in number,
  4  name out varchar2,
  5  address out varchar2,
  6  avg out number
  7  )
  8  as
  9  begin
 10  select sname,sadd,savg into name,address,avg from student where sid=sno;
 11  end;
 */


public class CsProcedureSelectTest1 
{
	private static final String CS_PROCEDURE_QUERY="{CALL P_GET_STUDENT_DETAILS(?,?,?,?)}";
	public static void main(String[] args) 
	{
		//READ INPUT
		try(Scanner sc= new Scanner(System.in))
		{
			int studentId=0;
			if(sc!=null)
			{
				System.out.println("enter student id");
				studentId=sc.nextInt();
			}
			try(//established connection
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
				//Create callable Statement
					CallableStatement cs=con.prepareCall(CS_PROCEDURE_QUERY);)
			{
				//register with out params jdbc database 
					if(cs!=null)
					{
					cs.registerOutParameter(2, Types.VARCHAR);
					cs.registerOutParameter(3, Types.VARCHAR);
					cs.registerOutParameter(4, Types.FLOAT);
					}
				//set values to IN params
					if(cs!=null)
					{
						cs.setInt(1, studentId);
					}
				//execute/call pl/sql funtions
					if(cs!=null)
						cs.execute();
				//gather result form OUT params
					if(cs!=null)
					{
						String sname=cs.getString(2);
						String sadd=cs.getString(3);
						Float sal=cs.getFloat(4);
						
						System.out.println("sname::"+sname+"sadd::"+sadd+"salary::"+sal);
					}//if
			}//try2
		}//try1
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
