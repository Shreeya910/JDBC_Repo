package jdbcpackage;

import java.sql.*;

public class DataBaseMetaDatademo
{

	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shreeya";
		String username = "root";
		String password = "ammu910$S";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		DatabaseMetaData dbmd = con.getMetaData();
		
		System.out.println("Database Details");
		System.out.println("Database Product Name : " + dbmd.getDatabaseProductName());
		System.out.println("Database Product Version : " + dbmd.getDatabaseProductVersion());
		System.out.println("Database Major Version : " + dbmd.getDatabaseMajorVersion());
		System.out.println("Database Minor Version" + dbmd.getDatabaseMinorVersion());
		System.out.println();
		System.out.println("JDBC Details");
		System.out.println("JDBC Major Version : " + dbmd.getJDBCMajorVersion());
		System.out.println("JDBC Minor Version : " + dbmd.getJDBCMinorVersion());
		System.out.println();
		System.out.println("Driver Details");
		System.out.println("Driver Name : " + dbmd.getDriverName());
		System.out.println("Driver Version : " + dbmd.getDriverVersion());
		System.out.println("Driver Major Version : " + dbmd.getDriverMajorVersion());
		System.out.println("Driver Minor Version : " + dbmd.getDriverMinorVersion());
		
		System.out.println();
		System.out.println("Username : " + dbmd.getUserName());
		System.out.println("SQL Keywords : " + dbmd.getSQLKeywords());
		System.out.println("URL : " + dbmd.getURL());
		System.out.println("Max table length : " + dbmd.getMaxTableNameLength());
		System.out.println("Max columns in table : " + dbmd.getMaxColumnsInTable());

	}
 
}
