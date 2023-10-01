package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Ex22 
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
	            String sqlQuery = "SELECT E.empno, E.ename, E.job, E.sal "
	            		+ "FROM emp_tabel E "
	            		+ "WHERE (E.job, E.sal) IN ( SELECT job, MIN(sal) FROM emp_tabel GROUP BY job ) "
	            		+ "ORDER BY E.job ASC;";



	            // Execute the SQL query
	            ResultSet rs = smt.executeQuery(sqlQuery);

	            

	            // Process the result set and store the total salary for each manager
	            while (rs.next()) {
	                int empno = rs.getInt("Empno");
	                String ename = rs.getString("Ename");
	                String job = rs.getString("Job");
	                double sal = rs.getDouble("Sal");
	                System.out.println("Empno: " + empno + ", Ename: " + ename + ", Job: " + job + ", Sal: " + sal);
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
