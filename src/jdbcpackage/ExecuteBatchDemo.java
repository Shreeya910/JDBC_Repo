package jdbcpackage;

import java.sql.*;

public class ExecuteBatchDemo
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shreeya";
		String username = "root";
		String password = "ammu910$S";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		PreparedStatement pstmt = con.prepareStatement("select * from emp");
		
		ResultSet rset = pstmt.executeQuery();
		while (rset.next())
			System.out.println(rset.getInt(1) + " " + rset.getString(2));
		
		// inserting records into the emp table
		pstmt.addBatch("insert into emp values(24,'Arya')");
		pstmt.addBatch("insert into emp values(25,'Arun')");
		pstmt.addBatch("insert into emp values(26,'Rahul')");
		pstmt.addBatch("update emp set ename='Karan' where eid=24");
		pstmt.addBatch("insert into emp values(27,'Varsha')");

		
		int[] i = pstmt.executeBatch();

		System.out.println("No.of Records inserted :" + i.length);

	}

}
