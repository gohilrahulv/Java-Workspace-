package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ex13 
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
	            String sqlQuery = "SELECT E.empno, E.ename, E.hiredate , M.empno AS MgrEmpno, M.ename AS MgrEname, M.hiredate AS MgrExp "
	            		+ "FROM emp_tabel E "
	            		+ "INNER JOIN emp_tabel M ON E.mgr = M.empno "
	            		+ "WHERE E.hiredate > M.hiredate;";

	            // Execute the SQL query
	            ResultSet rs = smt.executeQuery(sqlQuery);

	            // Iterate through the result set and print employee information
	            while (rs.next()) {
	                int empno = rs.getInt("Empno");
	                String ename = rs.getString("Ename");
	                int hiredate = rs.getInt("Hiredate");
	                int mgrEmpno = rs.getInt("MgrEmpno");
	                String mgrEname = rs.getString("MgrEname");
	                int mgrExp = rs.getInt("MgrExp");
	                System.out.println("Empno: " + empno + ", Ename: " + ename + ", Hiredate: " + hiredate +
	                                   ", MgrEmpno: " + mgrEmpno + ", MgrEname: " + mgrEname + ", MgrExp: " + mgrExp);
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
