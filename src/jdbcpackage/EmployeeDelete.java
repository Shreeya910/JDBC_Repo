package jdbcpackage;

import java.sql.*;

public class EmployeeDelete 
{

	public static void main(String[] args) throws Exception
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/ammu";
			String username = "root";
			String password = "ammu910$S";
			
			con = DriverManager.getConnection(url, username, password);
			
			pstmt = con.prepareStatement("delete from employee where eid=9");
			
			int i = pstmt.executeUpdate();
			System.out.println("No: of rows effected : " + i);
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			con.close();
			pstmt.close();
		}

	}

}
