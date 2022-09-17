package com.ni.jdbc.Rowsets;

import java.sql.SQLException;

import oracle.jdbc.rowset.OracleCachedRowSet;
import oracle.jdbc.rowset.OracleJoinRowSet;

public class OracleJoinRowsetTest 
{
	public static void main(String[] args) {
		try(OracleCachedRowSet cache1= new OracleCachedRowSet();
			OracleCachedRowSet cache2= new OracleCachedRowSet();
			OracleJoinRowSet join= new OracleJoinRowSet())
		{
			cache1.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			cache1.setUsername("C##GOKATE");
			cache1.setPassword("oracle");
			cache1.setMatchColumn(5);
			cache1.setCommand("SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP");
			cache1.execute();

			cache2.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			cache2.setUsername("C##GOKATE");
			cache2.setPassword("oracle");
			cache2.setMatchColumn(1);
			cache2.setCommand("SELECT DEPTNO,DNAME,LOC FROM DEPT");
			cache2.execute();
			
			join.addRowSet(cache1);
			join.addRowSet(cache2);
			
			while(join.next())
			{
				System.out.println(join.getString(1)+" "+join.getString(2)+" "+join.getString(3)+" "+join.getString(4)
									+" "+join.getString(5)+" "+join.getString(6)+" "+join.getString(7));
			}
			
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
