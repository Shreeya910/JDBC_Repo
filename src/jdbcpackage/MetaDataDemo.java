package jdbcpackage;

import java.sql.*;

public class MetaDataDemo 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shreeya";
		String username = "root";
		String password = "ammu910$S";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM EMP");
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		System.out.println("Table Details");
		System.out.println("Table name : " + rsmd.getTableName(2));
		System.out.println("No: of columns : " + rsmd.getColumnCount());
		System.out.println("Column Type Name : " + rsmd.getColumnTypeName(1));
		System.out.println("Column Type: " + rsmd.getColumnType(1));
		System.out.println("Column Class name : " + rsmd.getColumnClassName(1));
		System.out.println("Column Name : " + rsmd.getColumnName(1));
		
		
	}

}
