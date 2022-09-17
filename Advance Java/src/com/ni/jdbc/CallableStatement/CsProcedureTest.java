package com.ni.jdbc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;
/*
	Create or Replace procedure P_get_emp_Details_by_id
    (
      no in number,
      name out varchar2,
      desg out varchar2,
      salary out varchar2
     )
     as
    begin
   Select ename,job,sal into name,desg,salary from emp where empno=no;
    END;
 */


public class CsProcedureTest 
{
	private static final String CS_PROCEDURE_QUERY="{CALL P_FIRST(?,?,?)}";
	public static void main(String[] args) 
	{
		//Input read
		int x=0,y=0;
		try(Scanner sc= new Scanner(System.in))
		{
			System.out.println("Enter first value::");
			x=sc.nextInt();
			System.out.println("Enter second value::");
			y=sc.nextInt();
		
		//establish connection
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
		// create CallableStatement object
			CallableStatement cs=con.prepareCall(CS_PROCEDURE_QUERY);)
		{
		// register out params with JDBC datatype
			cs.registerOutParameter(3, Types.INTEGER);
		//set values to IN params
			cs.setInt(1, x);
			cs.setInt(2, y);
		//execute/call pl/sql procedure
			cs.execute();
		//gather result form out params
			int result=cs.getInt(3);
			System.out.println("Sum::"+result);
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
