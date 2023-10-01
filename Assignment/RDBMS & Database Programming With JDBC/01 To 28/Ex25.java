package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;


public class Ex25 
{
	public static void main(String[] args) 
	{
		 	String host = "jdbc:mysql://localhost:3306/";
	        String db = "rdbms";
	        String url = host+db;
	        Scanner sc = new Scanner(System.in);
	        

	        try {
	        	//load the MySQL JDBC driver class
	        	Class.forName("com.mysql.jdbc.Driver");
	            // Establish a database connection
	            Connection con = DriverManager.getConnection(url, "root", "");

	            // Create a SQL statement
	            Statement smt = con.createStatement();
	           

	            // Define the SQL query to select unique job titles
	            String query = "CREATE PROCEDURE IF NOT EXISTS GetEmployeeAndDeptName(IN dno INT) BEGIN SELECT E.ename, D.dname FROM emp_tabel E JOIN dept_tabel D ON E.deptno = D.deptno WHERE E.deptno = dno; END;;";

	            
	            
	            // Execute the CREATE VIEW SQL statement
	            smt.executeUpdate(query);
	            
	            System.out.println("PROCEDURE GetEmployeeAndDeptName created successfully.");
	            System.out.println("---------------------------------------------------------");
	            
	            // Call the stored procedure
	            String callProcedureSQL = "call GetEmployeeAndDeptName(?)";
	            PreparedStatement callProcedureStatement = con.prepareStatement(callProcedureSQL);
	            System.out.println("Enter Dno. = ");
	            int dno = sc.nextInt();
	            callProcedureStatement.setInt(1, dno);;
	            

	            ResultSet rs = callProcedureStatement.executeQuery();

	            System.out.println("Ename\t\tdname");
	            // Iterate through the result set and print the data
	            while (rs.next()) {
	                String ename = rs.getString("ename");
	                String dname = rs.getString("dname");
	                System.out.println("Ename: " + ename + "\t, Dname: " + dname);
	            }

	            
	            // Close the resources
	            sc.close();
	            rs.close();
	            smt.close();
	            callProcedureStatement.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	}
}
