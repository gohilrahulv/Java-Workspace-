package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;



public class Ex27 
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

	           

	            // Define the SQL query to select unique job titles
	            String quary1 = "ALTER TABLE student_tabel MODIFY COLUMN sname VARCHAR(40)";
	            // Create a SQL statement
	            Statement smt = con.createStatement();
	            
	            // Execute the CREATE VIEW SQL statement
	            smt.executeUpdate(quary1);
	            
	            System.out.println("Sname Length Change From 14 to 40");

	          
	            
	            // Close the resources
	            
	            smt.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	}
}
