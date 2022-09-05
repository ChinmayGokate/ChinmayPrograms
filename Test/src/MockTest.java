import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MockTest 
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			if(con!=null)
				st=con.createStatement();
			//String st1="INSERT INTO STUDENT VALUES (10,'MOCK','HYD',78.07)";
			String st1="UPDATE STUDENT SET SNAME='MOCK1' WHERE SID=11";
			//String st1="SELECT * FROM STUDENT";
			
			if(st!=null)
			{
				boolean flag=st.execute(st1);
				if(flag==true) 
				{
					System.out.println("Select SQL query executed ");
					rs=st.getResultSet();	
				
					if(rs!=null)
					{
						while(rs.next())
						{
							System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
						}
					}
				}
				else
					{
						System.out.println("Non Select SQL query executed ");
						int count=st.getUpdateCount();
						System.out.println("no. of record affected: "+count);
					}
				
		}
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
			
			try
			{
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
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
			
		}
}}
