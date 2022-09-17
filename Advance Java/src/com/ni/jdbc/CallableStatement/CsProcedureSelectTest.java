package com.ni.jdbc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;



public class CsProcedureSelectTest 
{
	private static final String CS_PROCEDURE_QUERY="{CALL P_GET_EMP_DETAILS_BY_ID(?,?,?,?)}";
	public static void main(String[] args) 
	{
		//Input read
		int empno=0,y=0;
		try(Scanner sc= new Scanner(System.in))
		{
			if(sc!=null)
			{
			System.out.println("Enter empno ::");
			empno=sc.nextInt();
			}
		
		//establish connection
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
		// create CallableStatement object
			CallableStatement cs=con.prepareCall(CS_PROCEDURE_QUERY);)
		{
		// register out params with JDBC datatype
			if(cs!=null)
			{
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.registerOutParameter(4,Types.VARCHAR);
		//set values to IN params
			cs.setInt(1, empno);
			
		//execute/call pl/sql procedure
			cs.execute();
		//gather result form out params
			String ename=cs.getString(2);
			String job=cs.getString(3);
			Float sal=cs.getFloat(4);
			
			System.out.println("ename:: "+ename+" job:: "+job+" sal:: "+sal);
			}
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
