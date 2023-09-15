//Program to display records from student table

package jdbcpackage;

//1. Importing the packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Student1_Demo1 
{
	public static void main(String[] args) throws Exception
	{
		//2. Loading the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//3. Establishing the connection between java and database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shreeya","root","ammu910$S");
		
		//4. Creating the statement
		Statement st = con.createStatement();
		
		//5. Executing the statement
		ResultSet set = st.executeQuery("select s_name from student");
		
		//6. Printing the output
		System.out.println("s_name");
		while(set.next())
			System.out.println(set.getString("s_name"));
		
		//7. Closing the connection
		con.close();
		st.close();
		set.close();

	}

}
