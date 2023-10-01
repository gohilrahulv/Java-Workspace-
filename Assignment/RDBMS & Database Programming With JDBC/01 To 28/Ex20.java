package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Ex20 
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
	            String sqlQuery = "SELECT mgr, SUM(sal) AS TotalSalary FROM emp_tabel GROUP BY mgr;";



	            // Execute the SQL query
	            ResultSet rs = smt.executeQuery(sqlQuery);

	            

	            // Process the result set and store the total salary for each manager
	            while (rs.next()) {
	                int mgr = rs.getInt("Mgr");
	                double totalSalary = rs.getDouble("TotalSalary");

	                System.out.println("Mgr " + mgr + ": Total Salary = " + totalSalary);
	                
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
