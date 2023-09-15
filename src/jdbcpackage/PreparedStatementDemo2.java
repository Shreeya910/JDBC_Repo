package jdbcpackage;

import java.sql.*;

public class PreparedStatementDemo2
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
			
			pstmt = con.prepareStatement("insert into employee values(?,?,?,?)");
			pstmt.setInt(1, 8);
			pstmt.setString(2, "Rani");
			pstmt.setInt(3, 35000);
			pstmt.setInt(4, 28);
			
			int i = pstmt.executeUpdate();
			
			pstmt.setInt(1, 9);
			pstmt.setString(2, "Vennela");
			pstmt.setInt(3, 40000);
			pstmt.setInt(4, 21);
			
			i += pstmt.executeUpdate();
			
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
