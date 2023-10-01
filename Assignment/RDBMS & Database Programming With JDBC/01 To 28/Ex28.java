package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;



public class Ex28 
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
	            String query = "CREATE TRIGGER IF NOT EXISTS UpdateSalaryTrigger "
	            		+ "AFTER UPDATE ON emp_tabel FOR EACH ROW "
	            		+ "BEGIN "
	            		+ "IF NEW.sal <> OLD.sal THEN "
	            		+ "INSERT INTO emp_log (emp_id, new_salary, action) "
	            		+ "VALUES (NEW.empno, NEW.sal, 'New Salary'); "
	            		+ "END IF; "
	            		+ "END;;";	   

	            // Execute the CREATE VIEW SQL statement
	            smt.executeUpdate(query);
	            
	            System.out.println("-------------------------------------------------------------");
	            System.out.println("Trigger 'UpdateSalaryTrigger' created successfully.");
	            System.out.println("-------------------------------------------------------------");
	            
	            // Close the resources

	            smt.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	}
}
