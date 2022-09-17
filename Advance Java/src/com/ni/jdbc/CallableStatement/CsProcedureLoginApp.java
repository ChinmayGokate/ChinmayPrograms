package com.ni.jdbc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

/*
 create or replace procedure P_authentication
  2   (
  3     username in varchar2,
  4   password in varchar2,
  5    result out varchar2
  6    )
  7    as
  8    cnt number(5);
  9  begin
 10   Select count(*) into cnt from irctc where uname=username and pwd=password;
 11     if(cnt<>0) then
 12             result:='valid credential';
 13     else
 14             result:='invalid credential';
 15     end if;
 16*  end;
 17  /

Procedure created.
SQL> variable k number(5);
SQL> execute p_authentication('chinmay','c1',:k);

PL/SQL procedure successfully completed.

SQL> print k;

K
--------------------------------------------------------------------------------
valid credential

 */


public class CsProcedureLoginApp 
{
	private static final String CS_PROCEDURE_QUERY="{CALL P_authentication(?,?,?)}";
	public static void main(String[] args) 
	{
		//READ INPUT
		try(Scanner sc=new Scanner(System.in);)
		{
			String username=null,password=null;
			if(sc!=null)
			{
				System.out.println("enter username::");
				username=sc.nextLine();
				System.out.println("Enter password::");
				password=sc.next();
			}
			try(//established connection
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
				// create callable statement
					CallableStatement cs=con.prepareCall(CS_PROCEDURE_QUERY);)
			{
				//register OUT parems with jdbc database
					if(cs!=null)
					{
						cs.registerOutParameter(3, Types.VARCHAR);
					}
				//set values to IN params
					if(cs!=null)
					{
						cs.setString(1, username);
						cs.setString(2, password);

					}
				//execute/call pl/sql procedure
					if(cs!=null)
					{
						cs.execute();
					}
				//gather the result of OUT params
					if(cs!=null) 
					{
						String result=cs.getString(3);
						System.out.println("result::"+result);
					}
			}//try2
		}//try1
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
