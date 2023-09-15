package jdbcpackage;

import java.sql.*;

public class EmployeeDemo 
{

	public static void main(String[] args) throws Exception
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/ammu";
			String username = "root";
			String password = "ammu910$S";
			
			con = DriverManager.getConnection(url, username, password);
			
			stmt = con.createStatement();
			
			rset = stmt.executeQuery("SELECT EID, ENAME FROM EMPlOYEE");
			
			while(rset.next())
				System.out.println(rset.getInt("eid")+" "+rset.getString("ename"));
			
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			con.close();
			stmt.close();
			rset.close();
		}

	}

}
