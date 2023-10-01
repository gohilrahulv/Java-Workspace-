package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ex14 
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
	            String sqlQuery = "SELECT E.empno, E.ename, E.job, E.deptno "
	            		+ "FROM emp_tabel E "
	            		+ "WHERE E.deptno = 20 AND E.job IN (SELECT DISTINCT job FROM emp_tabel WHERE deptno = 10);";



	            // Execute the SQL query
	            ResultSet rs = smt.executeQuery(sqlQuery);

	            // Iterate through the result set and print employee information
	            while (rs.next()) {
	                int empno = rs.getInt("Empno");
	                String ename = rs.getString("Ename");
	                String job = rs.getString("Job");
	                int deptno = rs.getInt("Deptno");
	                System.out.println("Empno: " + empno + ", Ename: " + ename + ", Job: " + job + ", Deptno: " + deptno);
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
