package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ex06 
{
	public static void main(String[] args) 
	{
		 String host = "jdbc:mysql://localhost:3306/";
	        String db = "rdbms";
	        String url = host+db;
	       

	        try {
	        	//load the MySQL JDBC driver class
	        	Class.forName("com.mysql.jdbc.Driver");
	            // Establish a database connection
	            Connection con = DriverManager.getConnection(url, "root", "");

	            // Create a SQL statement
	            Statement smt = con.createStatement();

	            // Define the SQL query to select unique job titles
	            String sqlQuery = "SELECT empno, ename, sal, hiredate FROM emp_tabel WHERE mgr =  7369";

	            // Execute the SQL query
	            ResultSet rs = smt.executeQuery(sqlQuery);

	            // Print the header
	            System.out.println("Empno\tEname\tSal\tHiredate");

	            // Iterate through the result set and print employee information
	            
	            	while (rs.next()) {
		                int empno = rs.getInt("Empno");
		                String ename = rs.getString("Ename");
		                double sal = rs.getDouble("Sal");
		                int hiredate = rs.getInt("hiredate");
		                System.out.println("Empno: " + empno + ", Ename: " + ename + ", Sal: " + sal+", hiredate: " + hiredate);
		            }          

	            // Close the resources
	            rs.close();
	            smt.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	}
}
