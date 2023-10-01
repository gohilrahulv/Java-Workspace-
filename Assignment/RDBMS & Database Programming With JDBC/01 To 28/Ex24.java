package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Ex24 
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
	            String query = "CREATE VIEW IF NOT EXISTS v1 AS SELECT E.ename, E.job, D.dname, D.loc FROM emp_tabel E JOIN dept_tabel D ON E.deptno = D.deptno;";

	            
	            
	            // Execute the CREATE VIEW SQL statement
	            smt.executeUpdate(query);
	            
	            System.out.println("View v1 created successfully.");
	            System.out.println("---------------------------------------------------------");
	            // SQL query to select data from the view v1
	            String sql = "SELECT ename, job, dname, loc FROM v1";

	            // Create a PreparedStatement
	            ;

	            // Execute the query
	            ResultSet resultSet = smt.executeQuery(sql);

	            // Iterate through the result set and print the data
	            while (resultSet.next()) {
	                String ename = resultSet.getString("ename");
	                String job = resultSet.getString("job");
	                String dname = resultSet.getString("dname");
	                String loc = resultSet.getString("loc");
	                System.out.println("Ename: " + ename + ", Job: " + job + ", Dname: " + dname + ", Loc: " + loc);
	            }
	          
	            
	            // Close the resources
	            resultSet.close();
	            smt.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	}
}
