package jdbcpackage;

import java.sql.*;

public class Student1_Demo2 
{

	public static void main(String[] args)  throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shreeya";
		String username = "root";
		String password = "ammu910$S";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM STUDENT");
		
		System.out.println("s_no" + "\t" + "s_name");
		while(rs.next())
			System.out.println(rs.getInt("s_no") + "\t" + rs.getString("s_name"));
		
		con.close();
		st.close();
		rs.close();

	}

}

