package jdbcpackage;

import java.sql.*;
import java.util.Scanner;

public class EmployeeUpdate2 
{

	public static void main(String[] args) throws Exception
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shreeya";
			String username = "root";
			String password = "ammu910$S";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement pstmt = con.prepareStatement("update emp set ename=? where eid=?");
			
			String s = null;
			String k = null;
			
			do
			{
				System.out.println("Enter Yes to update record, No to exit : ");
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				s = sc.next();
				
				if(s.equals("Yes") || s.equals("yes"))
				{
					System.out.println("Enter the eid of record to be updated : ");
					int eid = sc.nextInt();
					pstmt.setInt(2, eid);
					
					System.out.println("Enter employee name : ");
					String ename = sc.next();
					pstmt.setString(1, ename);
					
					int i = pstmt.executeUpdate();
					System.out.println("No: of rows effected : " + i);
					System.out.println();

				}
				
				else if (s.equals("No") || s.equals("no"))
				{
					System.out.println();
					System.out.println("Program exited");
					break;
				}
				
				else 
				{
					System.out.println("Invalid input");
					System.out.println();
				}
				
				System.out.println("Enter 'c' to continue or 'e' to exit : ");
				System.out.println("Warning : Strictly enter given terms only. ");
				k = sc.next();
				if(k.equals("e"))
				{
					System.out.println();
					System.out.println("Program exited");
					break;
				}
					
			}
			
			while(k.equals("c"));
			
			
			con.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
